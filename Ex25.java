import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = ex.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = ex.nextInt();

        int minutosConvertidos = hora * 60;
        int totalMinutos = minutos + minutosConvertidos;
        int totalSegundos = totalMinutos * 60;


        System.out.println("A hora digitada convertida em minutos é: " + minutosConvertidos + " minutos");
        System.out.println("O total dos minutos é: " + totalMinutos + " minutos");
        System.out.println("O total dos minutos convertidos em segundos é: " + totalSegundos + " segundos");

        ex.close();
    }
}

