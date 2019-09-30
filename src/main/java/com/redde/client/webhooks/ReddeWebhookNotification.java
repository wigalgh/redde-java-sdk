package com.redde.client.webhooks;

import com.redde.client.webhooks.ReddeWebhookStatus;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;



public class ReddeWebhookNotification {

    //Using the OkHttpClient object
    OkHttpClient client = new OkHttpClient();
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String VALID_JSON_CONTENT_TYPE = "application/json";
    

    //public static enum Status {OK, PENDING, PROGRESS, PAID, FAILED}

    /**
     * Method to convert JSON Response to Object
     * @param statusJson
     * @return ReddeWebhookStatus Object
     */
    public ReddeWebhookStatus statusObject(String statusJson) throws IOException{
        
       Gson gson = new Gson();
       ReddeWebhookStatus status = gson.fromJson(statusJson, ReddeWebhookStatus.class);
       
       return status;
    }

    /**
     * 
     * @param url Pass your callbarck url here
     * @return JSON Response body
     * @throws IOException
     */
    public String callbackUrl(String url) throws IOException {
        
        Request request = new Request.Builder()
            .header(CONTENT_TYPE_HEADER, VALID_JSON_CONTENT_TYPE)
            .url(url)
            .build();
             
            Response response = client.newCall(request).execute();
            return response.body().string();

    }

}