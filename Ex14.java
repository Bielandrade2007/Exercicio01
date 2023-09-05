import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int nascimento, ano, idade, meses, dias, semanas;

        System.out.print("Insira seu ano de nascimento: ");
        nascimento = ex.nextInt();

        System.out.print("Em que ano estamos: ");
        ano = ex.nextInt();

        idade = ano - nascimento;
        meses = idade * 12;
        dias = idade * 365;
        semanas = idade * 52;
        
        System.out.println("Você tem "+ idade + " anos");
        System.out.println("Você tem "+ meses + " meses");
        System.out.println("Você tem "+ dias + " dias");
        System.out.println("Você tem "+ semanas + " semanas");

        ex.close();
    }
}