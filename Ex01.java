import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = num.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = num.nextDouble();

        double resultado = numero1 - numero2;

        System.out.print("Resultado: " + resultado);

        num.close();
    }
}
