package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= numero) {
            soma += i; // soma = soma + i;
            i++;
        }

        System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);

        scanner.close();
    }
}
