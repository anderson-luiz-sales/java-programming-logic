package condicional.composta.else_if;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");

        System.out.print("Número 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Número 3: ");
        int num3 = scanner.nextInt();

        int maiorNumero = num1;

        if (num2 > maiorNumero) {
            maiorNumero = num2;
        }

        if (num3 > maiorNumero) {
            maiorNumero = num3;
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
