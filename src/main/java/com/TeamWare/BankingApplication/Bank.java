package com.TeamWare.BankingApplication;

public class Bank {
    public static BankAccount createAccount(String type){
        if(type.equalsIgnoreCase("saving")){
            return new SavingAccount();
        }
        else if(type.equalsIgnoreCase("current")){
            return new CurrentAccount();
        }
        else
        {
            throw new RuntimeException("Bank account type not found");
        }
    }
}
