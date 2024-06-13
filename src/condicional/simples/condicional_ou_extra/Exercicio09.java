package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do usuário:");
        int idade = scanner.nextInt();

        if (idade >= 18 || idade <= 65) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
