import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.println("Insira o peso(em kg): ");
        double peso = ex.nextDouble();

        double gramas = peso * 1000;

        System.out.println("O peso em gramas é: "+ gramas);

        ex.close();
    }
}
