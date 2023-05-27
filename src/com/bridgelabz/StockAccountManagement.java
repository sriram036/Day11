package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Stock> stocks = new ArrayList<>();
        System.out.println("Enter The Number of stock:");
        int numberOfStocks = scanner.nextInt();
        int count = 1;
        for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("Enter Share "+count+" Name:");
            String shareName = scanner.next();
            System.out.println("Enter Share "+count+" Number of shares:");
            int numberOfShares = scanner.nextInt();
            System.out.println("Enter Share "+count+" Price:");
            double sharePrice = scanner.nextInt();
            Stock stock = new Stock(shareName,numberOfShares,sharePrice);
            stocks.add(stock);
            count++;
        }
        double totalStockPrice = 0;
        count = 1;
        for (int i = 0; i < numberOfStocks; i++) {
            double sharePrice = stocks.get(i).getSharePrice();
            System.out.println("Share "+count+" Price is "+ sharePrice);
            totalStockPrice = totalStockPrice + sharePrice;
        }
        System.out.println("Total stock Price is "+totalStockPrice);
    }
}
