import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite o valor do cateto A: ");
        double catetoA = ex.nextDouble();

        System.out.print("Digite o valor do cateto B: ");
        double catetoB = ex.nextDouble();

        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        ex.close();
    }
}

