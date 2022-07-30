import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        Student aluno = new Student();
        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        double finalGrade = aluno.notaFinal();

        System.out.printf("FINAL GRADE = %.2f\n", finalGrade);
        if(finalGrade >= 60.00){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", 60-finalGrade);
        }

        sc.close();
    }
}
