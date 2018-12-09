package com.financialDashboard.models;

import java.util.Date;

public class Customer {

    private String transaction_type;
    private int transaction_id;
    private  int account_id;
    private String transaction_amount;
    private Date transaction_date;
    private  String transaction_comment;

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(String transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getTransaction_comment() {
        return transaction_comment;
    }

    public void setTransaction_comment(String transaction_comment) {
        this.transaction_comment = transaction_comment;
    }
}
