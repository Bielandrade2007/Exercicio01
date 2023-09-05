import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        double salario, boleto1, boleto2, totalBoletos, multa, total;

        System.out.print("Informe seu salário total: ");
        salario = ex.nextDouble();

        System.out.print("Valor do boleto 1: ");
        boleto1 = ex.nextDouble();

        System.out.print("Valor do boleto 2: ");
        boleto2 = ex.nextDouble();

        multa = boleto1 * 0.02 + boleto2 * 0.02;
        totalBoletos = boleto1 + boleto2;
        total = salario - (totalBoletos + multa);

        System.out.print("Após pagar as contas, restará "+total+" do salário de João");

        ex.close();
    }
}
