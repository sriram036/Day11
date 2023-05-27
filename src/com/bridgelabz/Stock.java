package com.bridgelabz;

public class Stock {
    String shareName;
    int numberOfShares;
    double sharePrice;

    public Stock(String shareName, int numberOfShares, double sharePrice) {
        this.shareName = shareName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getSharePrice() {
        return numberOfShares * sharePrice;
    }
}
