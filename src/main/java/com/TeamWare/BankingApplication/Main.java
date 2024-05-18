package com.TeamWare.BankingApplication;

public class Main {
    public static void main(String[] args) {
        BankAccount saving = Bank.createAccount("saving");
        User user1=new User("Alice",saving);
        user1.deposit(2000);
        System.out.println(user1.getName()+" Total Amount = "+user1.getAmount());
        System.out.println(user1.getName()+" Interest amount : "+user1.calculateInterest());
        user1.withdraw(500);
        System.out.println(user1.getName()+" Total Amount = "+user1.getAmount());

        BankAccount current=Bank.createAccount("current");
        User user2=new User("Bob",current);

        System.out.println();
        user2.deposit(3000);
        System.out.println(user2.getName()+" Total Amount = "+user2.getAmount());
        user2.withdraw(500);
        System.out.println(user2.getName()+" Total Amount = "+user2.getAmount());
        //user2.toString();
    }
}
