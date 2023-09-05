import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        double raio = ex.nextDouble();

        double comprimento = 2 * Math.PI * raio;

        double area = Math.PI * raio * raio;

        double volume = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);

        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);

        ex.close();
    }
}

