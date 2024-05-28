package repetitiva.while_.parteII;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= numero) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números de 1 até " + numero + " é " + soma);
        scanner.close();
    }
}
