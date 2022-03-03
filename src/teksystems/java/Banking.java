package teksystems.java;
import java.io.*;
import java.util.Date;

public class Banking {
    String userName;
    String userAddress;
    String bankName;
    String bankAddress;
    long routingNumber;
    long accountNumber;
    //TODO: fix methods for deposit/withdraw
    //current behavior:
    //1. deposit 55
    //2. current balance 55
    //3. withdraw 44
    //4. current balance -44
    static double balance;
    double annualFees;
    float interestRate;
    float tax;
    Date dateCreated = new Date();

    //TODO: create subclasses for account types
    // with specific methods for each class

    public static double deposit(double depositAmt){
        balance =+ depositAmt;
        return balance;
    }
    public static double withdraw(double withdrawAmt){
        balance =- withdrawAmt;
        return balance;
    }

}
