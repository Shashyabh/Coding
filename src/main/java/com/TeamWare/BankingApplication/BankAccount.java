package com.TeamWare.BankingApplication;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    default double calculateInterestRate(){
        return 0;
    }
}



