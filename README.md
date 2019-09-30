![Redde](https://www.reddeonline.com/assets/img/redde-logo.png =200x50)
# redde-java-sdk 

[![GitHub version](https://d25lcipzij17d.cloudfront.net/badge.svg?id=gh&type=6&v=1.0&x2=0)](https://github.com/wigalsolutionsltd/redde-java-sdk)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/wigalsolutionsltd/redde-java-sdk)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/wigalsolutionsltd/redde-java-sdk)
[![ForTheBadge built-by-developers](http://ForTheBadge.com/images/badges/built-by-developers.svg)](https://www.reddeonline.com/)
---------------------------------------------------------------------------


A Java SDK built around the Redde REST API that allows merchants to receive, send, check transaction status, and perform lots of payment transactions.


Before you can have access to APIs you need to register and create an [Account](https://app.reddeonline.com/register). Header for all request should have {"apikey": "string"}: and this API key will be sent to merchant when their app configuration is setup for them by Wigal.

For more information on documentation go to [developers.reddeonline.com](https://developers.reddeonline.com/rest-api.html)

 * [Installation](#installation)
 * [Usage](#usage)
 * [Examples](#examples)
 
Installation
------------

To use this library you'll need to have [created a Redde account](https://app.reddeonline.com/register). 


Usage
-----

Maven and Gradle repository will be ready soon


Create an api object with your API key and App ID which will be provided to you by the Redde Team:

```java

```

```java
ReddeApiClient api = new ReddeApiClient(apikey, appid);
```

Create an object for the ReddePay class so that you can access the methods like receiveMoney and sendMoney

```java
ReddePay pay = new ReddePay();
```        
    
Examples
--------
### Receiving money from Customer or Client
To use the API to recieve money from a customer, the receiveMoney() method will be used with a simple object made with chained methods and passing it as a parameter.

```java
/** 
 * An example object for passing parameters to receive money
 *
*/
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
```

### Sending money to Customer or Client
To use the API to send money to a customer, the sendMoney() method will be used with a simple object made with chained methods and passing it as a parameter.

```java
/** 
* An example object for passing parameters to receive money
*
*/
send.amount(1.0) //The amount to send
.appid(XX)  //App ID given to you by Wigal
.clientreference("wwwe435345") //reference for transaction made
.clienttransid("435") //ID for transaction made
.description("payment subscription") //Description for payment to send
.nickname("wigal") //Example name for sender
.paymentoption("MTN") // MTN | VODAFONE | AIRTELTIGO  payment options available
.walletnumber("024XXXXXXX") //Walletnumber of sender
.toString(); 

```

### Callbacks
Most APIs implement callbacks for easy tracking of api transactions so we've spawn something
simple for you to use. Check it out

```java
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

```

### An Example Class that shows a full implemetation 

```java
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
        */
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

        /** 
         * An example object for passing parameters to receive money
         *
        */
        send.amount(1.0) //The amount to send
        .appid(XX)  //App ID given to you by Wigal
        .clientreference("wwwe435345") //reference for transaction made
        .clienttransid("3243") //ID for transaction made
        .description("payment subscription") //Description for payment to send
        .nickname("wigal") //Example name for sender
        .paymentoption("MTN") // MTN | VODAFONE | AIRTELTIGO  payment options available
        .walletnumber("024XXXXXXX") //Walletnumber of sender
        .toString(); 
    
                                       
        try {

            /** 
             * Example on receiving money from customer
            */
            String receiveResponse = pay.receiveMoney(api, receive);
            System.out.println(receiveResponse);
            System.out.println("Recieve Money done");

            /** 
             * Example on sending money to customer
            */
            String sendResponse = pay.sendMoney(api, send);
            System.out.println(sendResponse);
            System.out.println("Send Money done");

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


```

# License
This library is released under the MIT License