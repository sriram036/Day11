package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int choice;
        do {
            System.out.println("1.To send the money to account:");
            System.out.println("2.To receive the money from account:");
            System.out.println("3.Show the balance");
            System.out.println("4.Exit");
            System.out.println("Enter the choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println("Enter the Amount:");
                    int amount = scanner.nextInt();
                    account.send(amount);
                    System.out.println("The money "+amount+" is added to account.");
                }break;
                case 2 : {
                    System.out.println("Enter the Amount");
                    int amount = scanner.nextInt();
                    if (amount > Account.balance) {
                        System.out.println("Debit money exceeded account balance");
                    }
                    else {
                        account.get(amount);
                        System.out.println("The money "+amount+" is debited from the account.");
                    }
                }break;
                case 3 : {
                    System.out.println("The balance amount is "+Account.balance);
                }break;
                default:{
                    System.out.println("Choice is Wrong! Please Try Again!");
                }
            }
        }while (choice != 4);
    }
}
