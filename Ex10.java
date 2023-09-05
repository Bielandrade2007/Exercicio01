import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Lado: ");
        double lado = ex.nextDouble();

        double area = lado * lado;

        System.out.print("A área do quadrado é: "+ area);

        ex.close();
    }
}
