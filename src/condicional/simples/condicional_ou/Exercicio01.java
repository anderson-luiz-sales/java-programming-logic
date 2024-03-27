package condicional.simples.condicional_ou;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0 || numero % 2 == 0) {
            System.out.println("Número válido");
        }

        if (!(numero > 0 || numero % 2 == 0)) {
            System.out.println("Número inválido");
        }
    }
}

