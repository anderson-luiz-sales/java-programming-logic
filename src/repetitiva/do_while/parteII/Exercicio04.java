package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro positivo (ou um número negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero; // Adiciona o número à soma se for positivo
            }
        } while (numero >= 0);

        System.out.println("A soma total dos números é: " + soma);
        scanner.close();
    }
}
