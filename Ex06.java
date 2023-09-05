import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.println("Insira o salário fixo: ");
        double salario = ex.nextDouble();

        System.out.println("Insira o valor das vendas: ");
        double vendas = ex.nextDouble();

        double comissao = vendas * 4/100;

        double salariofinal = salario + comissao;

        System.out.println("Comissão: "+ comissao);
        System.out.println("Salário final: "+ salariofinal);

        ex.close();
    }
}
