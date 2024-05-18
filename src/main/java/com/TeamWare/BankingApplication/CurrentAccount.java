package com.TeamWare.BankingApplication;

class CurrentAccount implements BankAccount{

    private double balance;
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
    public double getBalance() {
        return balance;
    }
}
