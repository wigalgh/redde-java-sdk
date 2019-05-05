package com.redde.client;

import com.google.gson.Gson;
import com.redde.client.model.ReddeApiRequest;
import com.redde.client.model.ReddeTransaction;


/**
 * Execute redde client here
 *
 */
public class ReddePay 
{

    //Method to receive money by passing api and object
    public String receiveMoney(ReddeApiRequest api,ReddeTransaction receiveObject) {
            Gson recJson = new Gson();
            String gsonRecieve = recJson.toJson(receiveObject);

            try {
                String response = api.post("receive", gsonRecieve);
                return response;
            } catch(Exception e) {
                return "Error whiles trying to receive money";
            }

    }
    
    //Method to send money by passing api and object
    public String sendMoney(ReddeApiRequest api,ReddeTransaction sendObject) {
            Gson recJson = new Gson();
            String gsonSend = recJson.toJson(sendObject);
            
            try {
                String response = api.post("cashout", gsonSend);
                return response;
            } catch(Exception e) {
                return "Error whiles trying to sending money";
            }

    }
    
    
}



