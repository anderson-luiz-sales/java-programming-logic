package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.println("Por favor, insira um número (ou um número negativo para sair):");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números positivos inseridos é: " + soma);
        scanner.close();
    }
}
