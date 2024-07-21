package condicional.revisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas que você dormiu: ");
        int horas = scanner.nextInt();

        if (horas >= 8) {
            System.out.println("Você teve uma boa noite de sono");
        } else {
            System.out.println("Você precisa dormir mais");
        }
    }
}
