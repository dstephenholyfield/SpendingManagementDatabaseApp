package com.example.spendingmanagementdatabaseapp;

public interface IDataAccess {
    public Balance loadBalance(double bal);
    public double saveBalance(Balance balance);
}
