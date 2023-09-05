import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite a medida do ângulo em graus: ");
        double angulo = ex.nextDouble();

        System.out.print("Digite a distância da escada à parede: ");
        double distancia = ex.nextDouble();

        double medidaEscada = distancia / Math.cos(Math.toRadians(angulo));

        System.out.println("A medida da escada é: " + medidaEscada);

        ex.close();
    }
}

