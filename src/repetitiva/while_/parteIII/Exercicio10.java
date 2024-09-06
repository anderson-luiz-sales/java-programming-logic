package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.print("Digite um número (ou 0 para parar): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // Sai do loop se o usuário digitar 0
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }

        scanner.close();
    }
}
