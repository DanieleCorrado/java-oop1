package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        Random randomGenerator = new Random();

        Conto userAccount = new Conto(randomGenerator.nextInt(), userName);

        System.out.println("Account info ");
        System.out.println("Name: " + userAccount.getName());
        System.out.println("Account code: " + userAccount.getAccountCode());
        System.out.println("Account balance: " + userAccount.getFormattedBalance() + "Є");

        System.out.println("Enter 1 to deposit an amount");
        System.out.println("Enter 2 to withdraw an amount");
        System.out.println("Enter 0 to exit");

        int action = -1;



        while (action !=0) {

            System.out.print("What do you want to do? ");
            action = scanner.nextInt();
            if (action == 1) {

                System.out.print("How much money do you want to deposit? ");
                double deposit = scanner.nextDouble();
                userAccount.addMoney(deposit);
                System.out.println("The account of: " + userAccount.getName() + " has " + userAccount.getFormattedBalance() + "Є");
            } else if (action == 2) {
                System.out.print("How much money do you want to withdraw? ");
                double withdraw = scanner.nextDouble();
                userAccount.withdrawMoney(withdraw);
                System.out.println("The account of: " + userAccount.getName() + " has " + userAccount.getFormattedBalance() + "Є");
            }
        }


        scanner.close();


    }
}
