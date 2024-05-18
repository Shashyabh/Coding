package com.TeamWare;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Interface for ATM operations
interface ATMOperations {
    void checkBalance(String pin);
    void withdrawCash(String pin, int amount);
    void deposit(String pin,int amount);
    // Other methods like deposit, transfer, etc.
}

// Singleton class for ATM
class ATM implements ATMOperations {
    private static ATM instance;
    private Map<String, Account> accounts;
    private int cashInATM;

    private ATM() {
        this.accounts = new HashMap<>();
        // Sample data - Add some accounts
        accounts.put("1234", new Account("John Doe", "1234", 500));
        accounts.put("5678", new Account("Jane Smith", "5678", 1000));
        this.cashInATM = 10000; // Initial cash in ATM
    }

    public static ATM getInstance() {
        if (instance == null) {
            instance = new ATM();
        }
        return instance;
    }

    public boolean authenticateUser(String pin) {
        return accounts.containsKey(pin);
    }

    @Override
    public void checkBalance(String pin) {
        if (authenticateUser(pin)) {
            System.out.println("Balance: " + accounts.get(pin).getBalance());
        } else {
            System.out.println("Invalid PIN");
        }
    }

    @Override
    public void withdrawCash(String pin, int amount) {
        if (authenticateUser(pin)) {
            Account account = accounts.get(pin);
            if (account.getBalance() >= amount && cashInATM >= amount) {
                account.withdraw(amount);
                cashInATM -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient funds or ATM out of cash.");
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }

    @Override
    public void deposit(String pin, int amount) {
        if(authenticateUser(pin)){
            Account account = accounts.get(pin);
            account.deposit(amount);
            cashInATM+=amount;
            System.out.println("Deposit successful. Total balance: " + account.getBalance());
        }
        else{
            System.out.println("Invalid PIN");
        }
    }

    // Other methods for deposit, transfer, change PIN, etc.
}

// Class for user account
class Account {
    private String name;
    private String pin;
    private int balance;

    public Account(String name, String pin, int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    // Other methods like deposit, transfer, etc.
}

// Factory class to create ATM object
class ATMFactory {
    public static ATM createATM() {
        return ATM.getInstance();
    }
}

// Class to handle user inputs
class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String enterPIN() {
        System.out.print("Enter PIN: ");
        return scanner.nextLine();
    }

    public static int enterAmount() {
        System.out.print("Enter amount: ");
        return scanner.nextInt();
    }

    public static void closeScanner() {
        scanner.close();
    }
}

public class Atm_Main {
    public static void main(String[] args) {
        ATM atm = ATMFactory.createATM();
        String pin = UserInputHandler.enterPIN();
        if (atm.authenticateUser(pin)) {
            int choice;
            do {
                System.out.println("_______________________________________________");
                System.out.println("1. Check Balance\n2. Withdraw Cash\n3. Deposit Money\n4. Exit\nEnter Your choice:");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance(pin);
                        break;
                    case 2:
                        int amount = UserInputHandler.enterAmount();
                        atm.withdrawCash(pin, amount);
                        break;
                    case 3:
                        int money = UserInputHandler.enterAmount();
                        atm.deposit(pin, money);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 4);
        } else {
            System.out.println("Invalid PIN");
        }
        UserInputHandler.closeScanner();
    }

}

