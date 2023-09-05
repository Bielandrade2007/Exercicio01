import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Base maior: ");
        double maior = ex.nextDouble();

        System.out.print("Base menor: ");
        double menor = ex.nextDouble();

        System.out.print("Altura: ");
        double altura = ex.nextDouble();

        double area = ((maior + menor) * altura) /2;

        System.out.print("A área total desse trapézio é: "+ area);

        ex.close();
    }
}