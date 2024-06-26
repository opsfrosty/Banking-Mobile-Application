package com.example.bankappp.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    public enum TRANSACTION_TYPE {
        PAYMENT,
        TRANSFER,
        DEPOSIT
    }



    private String transactionID;

    private String sendingAccount;
    private String destinationAccount;
    private String payee;
    private double amount;
    private TRANSACTION_TYPE transactionType;
    private long dbId;

    public Transaction (String transactionID, String payee, double amount) {
        this.transactionID = transactionID;
        this.payee = payee;
        this.amount = amount;
        transactionType = TRANSACTION_TYPE.PAYMENT;
    }

    public Transaction (String transactionID, String timestamp, String payee, double amount, long dbId) {
        this(transactionID, payee, amount);
        this.dbId = dbId;
    }

    public Transaction(String transactionID, double amount) {
        this.transactionID = transactionID;
        this.amount = amount;
        transactionType = TRANSACTION_TYPE.DEPOSIT;
    }

    public Transaction(String transactionID, String timestamp, double amount, long dbId) {
        this(transactionID, amount);
        this.dbId = dbId;
    }

    public Transaction(String transactionID, String sendingAccount, String destinationAccount, double amount) {
        this.transactionID = transactionID;
        this.sendingAccount = sendingAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        transactionType = TRANSACTION_TYPE.TRANSFER;
    }

    public Transaction(String transactionID, String timestamp, String sendingAccount, String destinationAccount, double amount, long dbId) {
        this(transactionID, sendingAccount, destinationAccount, amount);
        this.dbId = dbId;
    }

    /**
     * getters used to access the private fields of the transaction
     */
    public String getTransactionID() { return transactionID; }
    public String getSendingAccount() {
        return sendingAccount;
    }
    public String getDestinationAccount() {
        return destinationAccount;
    }
    public String getPayee() { return payee; }
    public double getAmount() {
        return amount;
    }
    public TRANSACTION_TYPE getTransactionType() {
        return transactionType;
    }

    public void setDbId(long dbId) { this.dbId = dbId; }

}
