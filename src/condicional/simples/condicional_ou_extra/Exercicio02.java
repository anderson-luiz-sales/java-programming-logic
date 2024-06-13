package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite 'true' se tem permissão de leitura ou 'false' se não tem:");
        boolean temPermissaoLeitura = scanner.nextBoolean();

        System.out.println("Digite 'true' se tem permissão de escrita ou 'false' se não tem:");
        boolean temPermissaoEscrita = scanner.nextBoolean();

        // Verifica se o usuário tem pelo menos uma das permissões usando operador ||
        if (temPermissaoLeitura || temPermissaoEscrita) {
            System.out.println("Acesso concedido para " + nome + ".");
        } else {
            System.out.println("Acesso negado para " + nome + ".");
        }

        scanner.close();
    }
}
