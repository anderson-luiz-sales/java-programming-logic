package vetor.processamento;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5]; // Cria um vetor para armazenar os nomes dos produtos

        // Coleta os nomes dos produtos
        System.out.println("Insira o nome de 5 produtos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine(); // Armazena o nome do produto
        }

        // Exibe os nomes dos produtos
        System.out.println("Os produtos inseridos são:");
        for (String produto : produtos) {
            System.out.println(produto); // Imprime cada nome de produto
        }
    }
}
