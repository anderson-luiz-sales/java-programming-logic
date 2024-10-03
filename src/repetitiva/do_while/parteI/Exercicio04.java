package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mult = 1;

        do {
            System.out.println("Por favor, insira um número (ou um número negativo para sair):");
            numero = scanner.nextInt();

            if (numero >= 0) {
                mult = numero * numero;
            }
        } while (numero >= 0);

        System.out.println("A multiplicação dos números positivos inseridos é: " + mult);
        scanner.close();
    }
}
