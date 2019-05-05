package com.redde.client.model;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ReddeApiRequest {

  private static final String BASE_URI = "https://api.reddeonline.com/v1";
  private static final String CONTENT_TYPE_HEADER = "Content-Type";
  private static final String VALID_JSON_CONTENT_TYPE = "application/json";
  public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
  private final String apikey;
  private final String appid;
    
    //Using the OkHttpClient object
    OkHttpClient client = new OkHttpClient();

    public ReddeApiRequest(final String apikey, final String appid) {
        this.apikey = apikey;
        this.appid = appid;
    }

    //Get request method
    public String get(String url) throws IOException {
        
        url = BASE_URI + "/" + url;
        Request request = new Request.Builder()
            .header("apikey", this.apikey)
            .header("appid", this.appid)
            .header(CONTENT_TYPE_HEADER, VALID_JSON_CONTENT_TYPE)
            .url(url)
            .build();
             
            Response response = client.newCall(request).execute();
            return response.body().string();

      }

    //Post request method
    public String post(String url, String json) throws IOException {
      url = BASE_URI + "/" + url;
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
            .header("apikey", this.apikey)
            .header("appid", this.appid)
            .url(url)
            .post(body)
            .build();

            Response response = client.newCall(request).execute();
            return response.body().string();
    }

}