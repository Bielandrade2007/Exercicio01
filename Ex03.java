import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner e3 = new Scanner(System.in);
        
        System.out.println("Insira um número para que a divisão seja realizada: ");
        double num1 = e3.nextDouble();

        System.out.println("Insira o segundo número: ");
        double num2 = e3.nextDouble();

        double resultado = num1/num2;

        System.out.println("O resultado da divisão é: "+ resultado);

        e3.close();
    }
}
