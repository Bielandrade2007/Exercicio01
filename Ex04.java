import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner e4 = new Scanner(System.in);

        System.out.println("Insira um número para calcular a média: ");
        double num1 = e4.nextDouble();

        System.out.println("Insira o segundo número para que a média seja feita: ");
        double num2 = e4.nextDouble();

        double media = (num1*2 + num2*3) /5;

        System.out.println("A média desses dois números é: "+ media);

        e4.close();
    }
}
