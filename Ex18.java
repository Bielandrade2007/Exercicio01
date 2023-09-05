import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = ex.nextDouble();

        double temperaturaFahrenheit = 180 * (temperaturaCelsius + 32) / 100;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        ex.close();
    }
}

