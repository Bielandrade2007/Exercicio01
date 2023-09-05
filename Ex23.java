import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite a medida do primeiro ângulo: ");
        double angulo1 = ex.nextDouble();

        System.out.print("Digite a medida do segundo ângulo: ");
        double angulo2 = ex.nextDouble();

        double angulo3 = 180 - angulo1 - angulo2;

        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");

        ex.close();
    }
}
