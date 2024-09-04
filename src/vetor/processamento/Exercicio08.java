package vetor.processamento;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] estoque = new int[3];  // Cria um vetor para o estoque
        int[] comprados = new int[3]; // Cria um vetor para as quantidades compradas
        int totalEstoque = 0;         // Inicializa o estoque total como 0

        // Coleta as quantidades em estoque
        System.out.println("Insira a quantidade em estoque de 3 tipos de livros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Tipo " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
        }

        // Coleta as quantidades compradas
        System.out.println("Insira a quantidade comprada de 3 tipos de livros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Tipo " + (i + 1) + ": ");
            comprados[i] = scanner.nextInt();
        }

        // Exibe a quantidade total de cada tipo de livro
        System.out.println("Quantidade total de cada tipo de livro:");
        for (int i = 0; i < 3; i++) {
            int totalTipo = estoque[i] + comprados[i]; // Calcula a quantidade total
            totalEstoque += totalTipo; // Adiciona ao estoque total
            System.out.printf("Tipo %d: %d%n", i + 1, totalTipo);
        }

        // Exibe a quantidade total de livros em estoque
        System.out.printf("Quantidade total de livros em estoque: %d%n", totalEstoque);
    }
}
