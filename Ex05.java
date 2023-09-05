import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.println("Insira o valor do produto que receberá o desconto: ");
        double valor = ex.nextDouble();

        double desconto = valor * 0.1;

        double preco = valor - desconto;

        System.out.println("O novo valor é: "+ preco);

        ex.close();
    }
}
