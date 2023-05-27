package com.bridgelabz;

public class Account {

    public static double balance;

    public void send(int amount) {
        balance = balance + amount;
    }

    public void get(int amount) {
        balance = balance - amount;
    }
}
