package repetitiva.for_;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 a " + numero + " é " + soma + ".");

        scanner.close();
    }
}
