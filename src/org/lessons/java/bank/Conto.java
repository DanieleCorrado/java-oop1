package org.lessons.java.bank;

public class Conto {

    private int accountCode;
    private String name;
    private double accountBalance;

    public Conto(int accountCode, String name) {
        this.accountCode = accountCode;
        this.name = name;
        this.accountBalance = 0;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getFormattedBalance() {
        return String.format("%.2f", accountBalance);
    }

    public void addMoney(double money) {
        this.accountBalance += money;
    }

    public void withdrawMoney(double money) {
        if (money <= this.accountBalance) {
            this.accountBalance -= money;
        } else {
            System.out.println("You don't have enough money in your account");
        }
    }
}
