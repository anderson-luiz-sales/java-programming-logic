package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero > 10 || numero < 0) {
            System.out.println("O número satisfaz pelo menos uma das condições.");
        } else {
            System.out.println("O número não satisfaz nenhuma das condições.");
        }

        scanner.close();
    }
}
