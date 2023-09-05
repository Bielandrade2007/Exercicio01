import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Insira o salário: ");
        double salario = ex.nextDouble();

        double minimo = 1.320;

        double calculo = salario / minimo; 

        System.out.print("Você recebe o equivalente a "+ calculo + " salários mínimos.");

        ex.close();
    }
}
