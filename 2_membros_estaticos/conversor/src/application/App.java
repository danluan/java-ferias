package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double dollarsAmount = sc.nextDouble();

        double total = CurrencyConverter.conversor(dollarsAmount, dollarPrice);

        System.out.printf("Amout to be paid in reais = %.2f%n", total);

        sc.close();
    }
}
