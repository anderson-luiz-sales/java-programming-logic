package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int i = 1;

        System.out.println("Números ímpares de 1 a " + numero + ":");
        while (i <= numero) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}
