import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = ex.nextInt();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = ex.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = ex.nextInt();

        double valorHoraTrabalhada = salarioMinimo / 8;
        double valorHoraExtra = salarioMinimo / 4;

        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double quantiaHorasExtras = horasExtras * valorHoraExtra;
        double salarioReceber = salarioBruto + quantiaHorasExtras;

        System.out.println("O salário a receber é: " + salarioReceber);

        ex.close();
    }
}


