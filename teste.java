import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Insira um número para que seja calculada sua tabuada: ");
        int num = ex.nextInt();

        int i = 0;

        while(i <= 10) {
            i++;
            int resultado = num * i;
            System.out.println (num + " × " + i + " = " + resultado);
        }

        ex.close();
    }
}