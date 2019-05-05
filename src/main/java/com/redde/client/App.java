package com.redde.client;

import com.redde.client.model.ReddeApiRequest;
import com.redde.client.model.ReddeTransaction;
import java.io.IOException;

/** 
 * An example of implenting Redde  for processing money
*/
class App {
    
    public static void main( String[] args )  throws IOException {

        String apikey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; //Your Api Key
        String appid = "XX"; //Your App Id
        
        ReddeApiRequest api = new ReddeApiRequest(apikey, appid); //Instantiate api object

        ReddePay pay = new ReddePay(); //Instantiate pay object
        
        ReddeTransaction receive = new ReddeTransaction(); //Instantiate receive object
        ReddeTransaction send = new ReddeTransaction();//Instantiate send object

        /** 
         * An object for passing parameters to receive money
        */
        receive.amount(1.0)
        .appid(11)
        .clientreference("wwwe435345")
        .clienttransid("435")
        .description("payment subscription")
        .nickname("wigal")
        .paymentoption("MTN")
        .walletnumber("0243721004")
        //.vouchercode("") // use this if you are receiving from vodafone
        .toString();

        /** 
         * An object for passing parameters to send money
        */
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
            /** 
             * Example on receiving money from customer
            */
            //String receiveResponse = pay.receiveMoney(api, receive);
            //System.out.println(receiveResponse);
            //System.out.println("Recieve Money done");

            /** 
             * Example on sending money to customer
            */
            String sendResponse = pay.sendMoney(api, send);
            System.out.println(sendResponse);
            System.out.println("Send Money done");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}