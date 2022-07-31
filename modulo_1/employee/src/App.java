import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();

        System.out.print("Name: ");
        emp1.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp1.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp1.tax = sc.nextDouble();

        System.out.println("\nEmployee: " + emp1);

        System.out.print("\nWhich percentage to increase salary? ");
        double percent = sc.nextDouble();
        emp1.IncreaseSalary(percent);

        System.out.println("\nUpdated data: " + emp1);
        sc.close();
    }
}
