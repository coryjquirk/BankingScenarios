package teksystems.java;
import java.util.Scanner;
//TODO: import Locale based currency formatter

public class Runnable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInterface = new String("Please select an option: \n1: Deposit to account \n2: Withdraw from account \n3: Show current balance \n4: Exit ");
        System.out.print(userInterface);
        int depositOrWithdraw = sc.nextInt();
        boolean switchAgain = false;
        do {
            switch (depositOrWithdraw) {
                case 1:
                    System.out.println("Please enter deposit amount: ");
                    double depositAmt = sc.nextDouble();
                    Banking.deposit(depositAmt);
                    System.out.println("Balance: " + Banking.balance);
                    System.out.println(userInterface);
                    switchAgain = true;
                    depositOrWithdraw = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount: ");
                    double withdrawAmt = sc.nextDouble();
                    Banking.withdraw(withdrawAmt);
                    System.out.println("Balance: " + Banking.balance);
                    System.out.println(userInterface);
                    switchAgain = true;
                    depositOrWithdraw = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Balance: " + Banking.balance);
                    System.out.println(userInterface);
                    switchAgain = true;
                    depositOrWithdraw = sc.nextInt();
                    break;
                case 4:
                    break;
            }
        } while (switchAgain = true);
        System.out.println(Banking.balance);
        sc.close();
    }
}
