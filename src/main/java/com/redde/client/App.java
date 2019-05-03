package com.redde.client;

import com.redde.client.model.ReddeApiClient;
import com.redde.client.model.ReddeTransaction;
import java.io.IOException;

class App {
    
    public static void main( String[] args )  throws IOException {

        String apikey = "TjWrCqYmxC2dvuDAa5Qep45cVQzHWBrg";
        String appid = "11";
        
        ReddeApiClient api = new ReddeApiClient(apikey, appid);

        ReddePay pay = new ReddePay();
        
        ReddeTransaction receive = new ReddeTransaction();
        ReddeTransaction send = new ReddeTransaction();
        
        receive.amount(1.0)
        .appid(11)
        .clientreference("wwwe435345")
        .clienttransid("435")
        .description("payment subscription")
        .nickname("wigal")
        .paymentoption("MTN")
        .walletnumber("0243721004")
        .toString();

        send.amount(1.0)
        .appid(11)
        .clientreference("wwwe435345")
        .clienttransid("435")
        .description("payment subscription")
        .nickname("wigal")
        .paymentoption("MTN")
        .walletnumber("0243721004")
        .toString();
    
                                       
        try {
            //String receiveResponse = pay.receiveMoney(api, receive);
            //System.out.println(receiveResponse);
            //System.out.println("Recieve Money done");

            String sendResponse = pay.sendMoney(api, send);
            System.out.println(sendResponse);
            System.out.println("Send Money done");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}