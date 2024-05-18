package com.TeamWare.BankingApplication;

class User {
    private String name;
    private BankAccount account;

    public String getName(){
        return this.name;
    }

    public User(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount) {
        System.out.println(this.name+ " Deposit amount : "+amount);
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        System.out.println(this.name+" Withdraw amount : "+amount);
         account.withdraw(amount);
    }

    public double calculateInterest() {
        return account.calculateInterestRate();
    }

    public double getAmount(){
        return account.getBalance();
    }
}
