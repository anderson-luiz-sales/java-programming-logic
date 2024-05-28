package repetitiva.while_.parteII;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int indece = 2; // Começando a sequência de números pares a partir de 2

        while (indece <= numero) {
            System.out.println(indece);
            indece = indece + 2; // Incrementando de 2 em 2 para manter apenas os números pares
        }

        scanner.close();
    }
}
