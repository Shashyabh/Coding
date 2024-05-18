package com.TeamWare.BankingApplication;

class SavingAccount implements BankAccount{

    private double balance;
    private double interestRate=10;


    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=balance){
            balance-=amount;
        }
        else {
            System.out.println("Insufficient fund");
        }
    }

    @Override
    public double calculateInterestRate() {
        return balance*(interestRate)/100;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}