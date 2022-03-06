package teksystems.java;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//TODO: import Locale based currency formatter

public class Runnable {
    public static void main(String[] args) throws IOException {
        Banking.initBankdataFile();
        Banking.setBalance(Double.parseDouble(Banking.readFromFile()));

        Scanner sc = new Scanner(System.in);
        String userInterface = "Please select an option: \n1: Deposit to account \n2: Withdraw from account \n3: Show current balance \n4: Exit ";
        System.out.print(userInterface);
        int depositOrWithdraw = sc.nextInt();
        do {
            switch (depositOrWithdraw) {
                case 1:
                    System.out.println("Please enter deposit amount: ");
                    double depositAmt = sc.nextDouble();
                    if (depositAmt > 0){
                        Banking.deposit(depositAmt);
                        System.out.println("Balance: " + Banking.getBalance());
                    } else {
                        System.out.println("Deposit amount must be greater than 0.");
                    }
                    System.out.println(userInterface);
                    depositOrWithdraw = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount: ");
                    double withdrawAmt = sc.nextDouble();
                    if (withdrawAmt > 0){
                        Banking.withdraw(withdrawAmt);
                        System.out.println("Balance: " + Banking.getBalance());
                    } else {
                        System.out.println("Withdraw amount must be greater than 0.");
                    }
                    System.out.println(userInterface);
                    depositOrWithdraw = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Balance: " + Banking.getBalance());
                    System.out.println(userInterface);
                    depositOrWithdraw = sc.nextInt();
                case 4:
                    //TODO: weird bug for the Exit msg.
                    System.out.println("Thank you! Exiting. Balance: " + Banking.getBalance());
                    break;
            }
        } while(depositOrWithdraw != 4);
        sc.close();
    }
}
