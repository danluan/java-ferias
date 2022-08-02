package application;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] prods = new Product[n];

        for(int i = 0; i < prods.length; i++){
            sc.nextLine();
            System.out.println("Product " + (i+1));
            System.out.print("Enter name: ");
            String nameTemp = sc.nextLine();
            System.out.print("Enter price: ");
            Double priceTemp = sc.nextDouble();
            prods[i] = new Product(nameTemp, priceTemp);
        }
        double sum = 0;

        for(int i = 0; i < prods.length; i++){
            sum += prods[i].getPrice();
        }

        double avg = sum/prods.length;
        
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();
        
    }
}
