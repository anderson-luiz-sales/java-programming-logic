package repetitiva.while_.parteII;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int i = 1; // Começando a sequência de números ímpares a partir de 1

        while (i <= numero) {
            soma += i;
            i += 2; // Incrementando de 2 em 2 para manter apenas os números ímpares
        }

        System.out.println("A soma dos números ímpares de 1 até " + numero + " é " + soma);

        scanner.close();
    }
}
