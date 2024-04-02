package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Create bank object
        Bank cplBank = new Bank();

        // A variable to save the choice from the menu
        int userChoice;

        do{
            System.out.println("1.Add account: ");
            System.out.println("2.Deposit Funds: ");
            System.out.println("3.Withdraw Funds: ");
            System.out.println("4.View transaction history");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch(userChoice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Enter account holder name: ");
                   String accountHolderName =  scanner.nextLine();

                    System.out.print("Enter  initial balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();// consumes new line character

                    System.out.print("Enter the account type ( e.g Savings/Checking): ");
                    String accountType = scanner.nextLine();

                    cplBank.addAccount(accountNumber,accountHolderName,balance,accountType);
                    break;

                case 2:
                    System.out.println("Enter Account Number");
                    accountNumber = scanner.nextLine();

                    BankAccount account = cplBank.getAccount(accountNumber);

                    if (account != null) {
                        System.out.println("Enter the amount to deposit");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }else {
                        System.out.println("Account not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = cplBank.getAccount(accountNumber);

                    if (account != null){
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    }else {
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter the account number: ");
                    accountNumber = scanner.nextLine();
                    account = cplBank.getAccount(accountNumber);

                    if (account != null) {
                        System.out.println("Transaction history for account: "+ accountNumber);
                        List<String> transactions = account.getTransaction();
                        for (String transaction : transactions){
                            System.out.println(transaction);
                        }

                    } else {
                        System.out.println("Account not found");

                    }
                    break;

                    case 5:
                        System.out.println("Exiting Program.....");
                        break;
                default:
                    System.out.println("Invalid Choice.Please enter choice between 1 and 4");

            }
        }while (userChoice != 5);

        // Close scanner
        scanner.close();


    }
}
