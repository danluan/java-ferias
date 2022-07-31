package util;

public class CurrencyConverter {

    public static final double TAX = 0.06;

    public static double conversor(double dollarsAmount, double dollarPrice){
        double total = dollarsAmount * dollarPrice;
        total += total*TAX;
        return total;
    }
}
