package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] data = new Person[n];

        for(int i = 0; i < data.length; i++){
            sc.nextLine(); 
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String tempName = sc.nextLine();
            System.out.print("Idade: ");
            int tempAge = sc.nextInt();
            System.out.print("Altura: ");
            double tempHeight = sc.nextDouble();

            data[i] = new Person(tempName, tempAge, tempHeight);
        }

        System.out.printf("\nAltura média: %.2f%\n", averageHeight(data));
        Person[] sub = sub16(data);
        double percent = ((double) sub.length/data.length) * 100.0;

        System.out.printf("\nPessoas com menos de 16 anos: %.1f %n", percent);
        for(int i = 0; i < sub.length; i++)
            System.out.println(sub[i].getName());

        sc.close();
    }

    public static Person[] sub16(Person[] data){
        int numSub16 = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i].getAge() < 16)
                numSub16++;
        }
        Person[] sub = new Person[numSub16];

        for(int i = 0, j = 0; i < data.length; i++){
            if(data[i].getAge() < 16){
                sub[j] = data[i];
                j++;
            }
        }
        return sub;
    }

    public static double averageHeight(Person[] data){
        double sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i].getHeight();
        }
        return sum/data.length;
    }
}
