package org.example;
import java.util.HashMap;
import java.util.Map;
public class Bank
{
    // attributes
    private Map<String,BankAccount> accounts;

    // Constructor
    public Bank () {
        accounts = new HashMap<>();
    }
    // A method to add an account
    public void addAccount (String accountNumber,String accountHolderName,double balance,String accountType){

        BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);

        accounts.put(accountNumber,account);

        System.out.println("Account Successfully Created.");
    }
    // A method to get an account
    public BankAccount getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }


    }

