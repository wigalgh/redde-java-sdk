package com.redde.client.model;

/**
 * A simple POJO class for ReddeTransaction
 */

public class ReddeTransaction {

    /**
     *  private member variable amount
     */
    private BigDecimal amount;

    /**
     *  private member variable appid
     */
    private int appid;

    /**
     *  private member variable clientreference
     */
    private String clientreference;

    /**
     *  private member variable clienttransid
     */
    private String clienttransid;

    /**
     *  private member variable description
     */
    private String description;

    /**
     *  private member variable nickname
     */
    private String nickname;

    /**
     *  private member variable paymentoption
     */
    private String paymentoption;

    /**
     *  private member variable vouchercode
     */
    private String vouchercode;

    /**
     *  private member variable walletnumber
     */
    private String walletnumber;

    /**
     * 
     * @return BigDecimal amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 
     * @param amount
     * @return
     */
    public ReddeTransaction amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 
     * @return
     */
    public int getAppId() {
        return appid;
    }

    /**
     * 
     * @param appid
     */
    public void setAppId(int appid) {
        this.appid = appid;
    }

    /**
     * 
     * @param appid
     * @return
     */
    public ReddeTransaction appid(int appid) {
        this.appid = appid;
        return this;
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
     * @param clientreference
     */
    public void setClientReference(String clientreference) {
        this.clientreference = clientreference;
    }

    /**
     * 
     * @param clientreference
     * @return
     */
    public ReddeTransaction clientreference(String clientreference) {
        this.clientreference = clientreference;
        return this;
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
     * @param clienttransid
     */
    public void setClientTransId(String clienttransid) {
        this.clienttransid = clienttransid;
    }

    /**
     * 
     * @param clienttransid
     * @return
     */
    public ReddeTransaction clienttransid(String clienttransid) {
        this.clienttransid = clienttransid;
        return this;
    }

    /**
     * 
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @param description
     * @return
     */
    public ReddeTransaction description(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 
     * @param nickname
     * @return
     */
    public ReddeTransaction nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 
     * @return
     */
    public String getPaymentOption() {
        return paymentoption;
    }

    /**
     * 
     * @param paymentoption
     */
    public void setPaymentOption(String paymentoption) {
        this.paymentoption = paymentoption;
    }

    /**
     * 
     * @param paymentoption
     * @return
     */
    public ReddeTransaction paymentoption(String paymentoption) {
        this.paymentoption = paymentoption;
        return this;
    }

    /**
     * 
     * @return
     */
    public String getVoucherCode() {
        return vouchercode;
    }

    /**
     * 
     * @param vouchercode
     */
    public void setVoucherCode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    /**
     * 
     * @param vouchercode
     * @return
     */
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

    /**
     *  Creating toString 
     */
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