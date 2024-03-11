package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount
{
    // attributes
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private List<String> transactionHistory;

    // Constructor
    public BankAccount(String accountNumber,String accountHolderName,double balance,String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.transactionHistory = new ArrayList<>();
        recordTransaction("Account created. Initial balance: ksh" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public List<String> getTransaction() {
        return transactionHistory;
    }

    // A method of depositing funds
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful.\n Current balance: "+ balance);
    }
    // A method for withdrawing funds
    public void withdraw(double amount){
        if (amount <= balance ){
            balance -= amount;
            System.out.println("Withdrawal of ksh: "+ amount + " was successful. \n Current balance: " + balance);
        }else{
            System.out.println("Insufficient funds. \n Withdrawal failed");
        }
    }

    // A method to record transactions
    public void recordTransaction(String description){
        String transaction = LocalDateTime.now() + ": " + description;
        transactionHistory.add(transaction);
        }
}


