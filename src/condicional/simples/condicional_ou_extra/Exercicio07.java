package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        if (usuario.equals("admin") || senha.equals("12345")) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
