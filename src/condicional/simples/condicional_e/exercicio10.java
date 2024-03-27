package condicional.simples.condicional_e;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade do interessado:");
        int idade = scanner.nextInt();

        System.out.println("Conhecimento de programação? (s/n):");
        char conhecimentoProgramacao = scanner.next().charAt(0);

        if (idade > 16 && conhecimentoProgramacao == 's') {
            System.out.println("Inscrever-se no curso utilizando a plataforma ChatGPT.");
        }
        if (!(idade > 16 && conhecimentoProgramacao == 's')) {
            System.out.println("Não se inscrever no curso utilizando a plataforma ChatGPT.");
        }

        scanner.close();
    }
}
