import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ex2 = new Scanner(System.in);

        System.out.println("Insira um de três números para realizar uma multiplicação: ");
        double num1 = ex2.nextDouble();

        System.out.println("Insira o segundo número: ");
        double num2 = ex2.nextDouble();

        System.out.println("Insira o terceiro e último número para que a multiplicação entre os três seja realizada");
        double num3 = ex2.nextDouble();

        double resultado = num1*num2*num3;

        System.out.println("O resultado da multiplicação dos números é: "+ resultado);

        ex2.close();
    }
}
