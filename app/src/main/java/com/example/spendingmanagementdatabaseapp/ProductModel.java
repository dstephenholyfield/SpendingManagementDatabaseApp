package com.example.spendingmanagementdatabaseapp;

public class ProductModel {

    public double mBal;

    public String toSQL() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mBal).append(",");
        return sb.toString();
    }

}