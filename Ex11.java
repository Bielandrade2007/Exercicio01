import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Diagonal maior: ");
        double maior = ex.nextDouble();

        System.out.print("Diagonal menor: ");
        double menor = ex.nextDouble();

        double area = maior * menor /2;

        System.out.println("Area total do losango é: "+ area);

        ex.close();
    }
}
