package repetitiva.while_.parte_I;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SENHA_CORRETA = 1234;
        int senha = 0;

        while (senha != 1234) {
            System.out.print("Digite a senha: " );
            senha = scanner.nextInt();

            if (senha == SENHA_CORRETA) {
                System.out.println("Bem vindo!");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Fim do programa");
        scanner.close();
    }
}
