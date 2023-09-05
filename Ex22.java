import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono: ");
        int numeroLados = ex.nextInt();

        int numeroDiagonais = numeroLados * (numeroLados - 3) / 2;

        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);

        ex.close();
    }
}
