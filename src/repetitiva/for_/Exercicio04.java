package repetitiva.for_;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int produto = 1;
        for (int i = 1; i <= numero; i++) {
            produto *= i;
        }

        System.out.println("O produto de 1 a " + numero + " é " + produto + ".");

        scanner.close();
    }
}
