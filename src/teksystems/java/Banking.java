package teksystems.java;
import java.io.*;
import java.util.Date;

public class Banking {
    private String userName;
    private String userAddress;
    private String bankName;
    private String bankAddress;
    private long routingNumber;
    private long accountNumber;
    private double annualFees;
    private float interestRate;
    private float tax;
    private Date dateCreated = new Date();
    //TODO: use FileWriter to store balance
    private static Double balance;
    private static String filePath = "file1.txt";

    public static void initBankdataFile(){
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("Bank data file exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String readFromFile() {
        String fileString = null;
        try {
            FileReader myReader = new FileReader(filePath);
            StringBuilder str = new StringBuilder();
            int i;
            while ((i = myReader.read()) != -1) {
//                System.out.print((char) i);
                str.append((char) i);
            }
            System.out.print("\n");
            myReader.close();
            System.out.println("Successfully read data from " + filePath);
            fileString = str.toString();
            return fileString;
        } catch (IOException e) {
            System.out.println("A file reading error occurred.");
            e.printStackTrace();
        }
        return fileString;
    }


    public static void writeToFile(Double balance){
        try {
            FileWriter myWriter = new FileWriter(filePath);

            String writeThis = balance.toString();

            myWriter.write(writeThis);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("A file writing error occurred.");
            e.printStackTrace();
        }
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Banking.balance = balance;
        writeToFile(balance);
    }

    public double getAnnualFees() {
        return annualFees;
    }

    public void setAnnualFees(double annualFees) {
        this.annualFees = annualFees;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //TODO: create subclasses for account types
    // with specific methods for each class
    public static void deposit(double depositAmt){
        setBalance(balance+=depositAmt);
    }

    public static void withdraw(double withdrawAmt){
        setBalance(balance-=withdrawAmt);
    }

}
