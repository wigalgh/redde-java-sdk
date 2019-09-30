package com.redde.client.webhooks;

import com.google.gson.Gson;

/**
 * A simple POJO class for ReddeWebhookStatus
 */

public class ReddeWebhookStatus {

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String reason;

    /**
     * 
     */
    private String transactionid;

    /**
     * 
     */
    private String telcotransid;

    /**
     * 
     */
    private String clienttransid;

    /**
     * 
     */
    private String clientreference;

    /**
     * 
     */
    private String statusdate;

    /**
     * 
     * @return
     */
    public String getStatus() {

        return status;
    }

    /**
     * 
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * 
     * @return
     */
    public String getTransactionId() {
        return transactionid;
    }

    /**
     * 
     * @return
     */
    public String getTelcoTransId() {
        return telcotransid;
    }

    /**
     * 
     * @return
     */
    public String getClientTransId() {
        return clienttransid;
    }

    /**
     * 
     * @return
     */
    public String getClientReference() {
        return clientreference;
    }

    /**
     * 
     * @return
     */
    public String getStatusDate() {
        return statusdate;
    }


    /*/ Creating toString 
    @Override
    */
    @Override
    public String toString() 
    { 
        return " [status= "
        + status 
        + ", reason="
        + reason
        + ", transactionid="
        + transactionid 
        + ", telcotransid="
        + telcotransid
        + ", clienttransid="
        + clienttransid 
        + ", clientreference="
        + clientreference
        + ", statusdate="
        + statusdate
        + "]";

    }
    
    /**
     * 
     * @param status
     * @return ReddeWebhookStatus
     */
    public ReddeWebhookStatus toObject(ReddeWebhookStatus status)
    {
        String arrayString = status.toString();
        ReddeWebhookStatus thisClass = new Gson().fromJson(arrayString,ReddeWebhookStatus.class);
        return thisClass;
    }
    
}