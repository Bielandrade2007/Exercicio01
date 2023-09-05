import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite a largura do cômodo em metros: ");
        double largura = ex.nextDouble();

        System.out.print("Digite o comprimento do cômodo em metros: ");
        double comprimento = ex.nextDouble();

        double area = largura * comprimento;

        double potenciaIluminacao = area * 18;

        System.out.println("Área do cômodo: " + area + " m²");
        System.out.println("Potência de iluminação necessária: " + potenciaIluminacao + " W");

        ex.close();
    }
}

