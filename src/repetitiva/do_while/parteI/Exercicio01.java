package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, insira um número positivo:");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numero <= 0);

        System.out.println("Obrigado! Você inseriu um número positivo.");
        scanner.close();
    }
}
