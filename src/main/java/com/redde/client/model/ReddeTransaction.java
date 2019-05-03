package com.redde.client.model;

/**
 * A simple POJO class for ReddeTransaction
 */

public class ReddeTransaction {

    public static enum Status {OK, PENDING, PROGRESS, PAID, FAILED}

    private Double amount;
    private int appid;
    private String clientreference;
    private String clienttransid;
    private String description;
    private String nickname;
    private String paymentoption;
    private String vouchercode;
    private String walletnumber;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ReddeTransaction amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public int getAppId() {
        return appid;
    }

    public void setAppId(int appid) {
        this.appid = appid;
    }

    public ReddeTransaction appid(int appid) {
        this.appid = appid;
        return this;
    }

    //Client Reference ID
    public String getClientReference() {
        return clientreference;
    }

    public void setClientReference(String clientreference) {
        this.clientreference = clientreference;
    }

    public ReddeTransaction clientreference(String clientreference) {
        this.clientreference = clientreference;
        return this;
    }

    //Client Transaction ID
    public String getClientTransId() {
        return clienttransid;
    }

    public void setClientTransId(String clienttransid) {
        this.clienttransid = clienttransid;
    }

    public ReddeTransaction clienttransid(String clienttransid) {
        this.clienttransid = clienttransid;
        return this;
    }

    //Transaction description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReddeTransaction description(String description) {
        this.description = description;
        return this;
    }

    //Merchant nickname
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ReddeTransaction nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    //Payment Option 
    public String getPaymentOption() {
        return paymentoption;
    }

    public void setPaymentOption(String paymentoption) {
        this.paymentoption = paymentoption;
    }

    public ReddeTransaction paymentoption(String paymentoption) {
        this.paymentoption = paymentoption;
        return this;
    }

    //Voucher Code
    public String getVoucherCode() {
        return vouchercode;
    }

    public void setVoucherCode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    public ReddeTransaction vouchercode(String vouchercode) {
        this.vouchercode = vouchercode;
        return this;
    }

    //Wallet Number
    public String getWalletNumber() {
        return walletnumber;
    }

    public void setWalletNumber(String walletnumber) {
        this.walletnumber = walletnumber;
    }

    public ReddeTransaction walletnumber(String walletnumber) {
        this.walletnumber = walletnumber;
        return this;
    }

    // Creating toString 
    @Override
    public String toString() 
    { 
        return " [amount= "
            + amount 
            + ", appid="
            + appid 
            + ", clientreference="
            + clientreference 
            + ", clienttransid="
            + clienttransid 
            + ", description="
            + description
            + ", nickname="
            + nickname 
            + ", paymentoption="
            + paymentoption
            + ", vouchercode="
            + vouchercode
            + ", walletnumber="
            + walletnumber + "]"; 
    } 
    
}