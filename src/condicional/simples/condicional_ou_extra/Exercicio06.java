package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível de permissão do usuário:");
        int nivelPermissao = scanner.nextInt();

        if (nivelPermissao == 1 || nivelPermissao == 2) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
