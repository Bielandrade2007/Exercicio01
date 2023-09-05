import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.println("Insira o peso: ");
        double peso = ex.nextDouble();

        double aumento = peso * 1.15;
        double perca = peso - (peso*0.20);

        System.out.println("Se engordar 15%: "+ aumento);
        System.out.println("Se emagrecer 20%: "+ perca);

        ex.close();
    }
}
