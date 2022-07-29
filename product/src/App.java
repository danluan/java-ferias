import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int newQuantity = sc.nextInt();
        product.addProducts(newQuantity);

        System.out.println("\nUpdate data: " + product);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        newQuantity = sc.nextInt();
        product.removeProducts(newQuantity);

        System.out.println("\nUpdate data: " + product);

        sc.close();
    }
}
