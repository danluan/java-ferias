package application;
import entities.Account;

import java.util.Locale;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accHolder = sc.nextLine();
        
        System.out.print("Is there an initial deposit (y/n)? ");
        String action = sc.nextLine();

        double value = 0;
        if(action.equals("y")){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
        }

        Account bankAccount = new Account(accNumber, accHolder, value);
        sc.nextLine();

        while(!action.equals("Stop")){
            sc.nextLine();
            System.out.println("\n\n\n\n\n");
            bankAccount.printAccountData();
            System.out.println("Which action you wanna do?");
            System.out.println("1 - Do Deposit.");
            System.out.println("2 - Do Withdraw.");
            System.out.println("Stop - Close the program.");
            action = sc.nextLine();

            if(action.equals("1")){
                System.out.print("Value of deposit: ");
                value = sc.nextDouble();
                bankAccount.deposit(value);
            } else if(action.equals("2")){
                System.out.print("Value of withdraw: ");
                value = sc.nextDouble();
                bankAccount.withdraw(value);
            }
        }
        System.out.println("Thanks for using our services! :D");

        sc.close();
    }
}
