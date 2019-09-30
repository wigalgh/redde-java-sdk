package com.redde.client;

import com.redde.client.model.ReddeApiRequest;
import com.redde.client.model.ReddeTransaction;
import com.redde.client.webhooks.ReddeWebhookNotification;
import com.redde.client.webhooks.ReddeWebhookStatus;
import java.io.IOException;

/** 
 * An example of implenting Redde  for processing money
*/
class App {
    
    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main( String[] args )  throws IOException {

        String apikey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; //Your Api Key
        String appid = "XX"; //Your App Id
        
        ReddeApiRequest api = new ReddeApiRequest(apikey, appid); //Instantiate api object

        ReddePay pay = new ReddePay(); //Instantiate pay object
        
        ReddeTransaction receive = new ReddeTransaction(); //Instantiate receive object
        ReddeTransaction send = new ReddeTransaction();//Instantiate send object
        ReddeWebhookStatus status = new ReddeWebhookStatus(); //Instantiate status object 
        ReddeWebhookNotification notification = new ReddeWebhookNotification(); //Instatiate notification object
        
        /** 
         * An example object for passing parameters to receive money
         *
        
        receive.amount(1.0) //The amount to receive
        .appid(XX)  //App ID given to you by Wigal
        .clientreference("wwwe435345") //reference for transaction made
        .clienttransid("435") //ID for transaction made
        .description("payment subscription") //Description for payment to recieve
        .nickname("wigal") //Example name for receiver
        .paymentoption("MTN") // MTN | VODAFONE | AIRTELTIGO  payment options available
        .walletnumber("024XXXXXXX") //Walletnumber of reciever
        //.vouchercode("") // use this if you are receiving from vodafone
        .toString(); 
        */

        /** 
         * An example object for passing parameters to receive money
         *
        
        send.amount(1.0) //The amount to send
        .appid(XX)  //App ID given to you by Wigal
        .clientreference("wwwe435345") //reference for transaction made
        .clienttransid("3243") //ID for transaction made
        .description("payment subscription") //Description for payment to send
        .nickname("wigal") //Example name for sender
        .paymentoption("MTN") // MTN | VODAFONE | AIRTELTIGO  payment options available
        .walletnumber("024XXXXXXX") //Walletnumber of sender
        .toString(); 
        */
                                       
        try {

            /** 
             * Example on receiving money from customer
            
            String receiveResponse = pay.receiveMoney(api, receive);
            System.out.println(receiveResponse);
            System.out.println("Recieve Money done");
            */

            /** 
             * Example on sending money to customer
            
            String sendResponse = pay.sendMoney(api, send);
            System.out.println(sendResponse);
            System.out.println("Send Money done");
            */

            //Pass your implemented callback url as a parameter for the callbackUrl method
            String callback = notification.callbackUrl("http://example.com/reddestatus/paid.php"); //or something url callable. 
            status = notification.statusObject(callback);
            
            //shout(status.toString());

            /*
             *shout is a simple function created around System.out.println
             */

            shout("Status is " +  status.getStatus());
            shout("Reason is " +  status.getReason());
            shout("Client Transacion Id is " +  status.getClientTransId());
            shout("Transaction ID is " +  status.getTransactionId());
            shout("Status Date " +  status.getStatusDate());

        } catch (Exception e) {
            //System.out.println("Something went wrong");
            e.printStackTrace();
        }

    }

    /**
     * This is used for development purposes to display things 
     * @param s 
     * 
     */
    private static void shout(String s) {
        System.out.println(s);
    }

}