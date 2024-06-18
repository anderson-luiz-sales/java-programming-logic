package repetitiva.do_while;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "12345";
        String senha;

        do {
            System.out.println("Por favor, insira a senha:");
            senha = scanner.nextLine();

            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals(senhaCorreta));

        System.out.println("Acesso concedido.");
        scanner.close();
    }
}
