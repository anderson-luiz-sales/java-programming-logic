package vetor.processamento;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] livros = new String[3]; // Cria um vetor para armazenar os nomes dos livros

        // Coleta os nomes dos livros
        System.out.println("Insira o nome de 3 livros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Livro " + (i + 1) + ": ");
            livros[i] = scanner.nextLine(); // Armazena o nome do livro
        }

        // Exibe os nomes dos livros
        System.out.println("Os livros inseridos são:");
        for (String livro : livros) {
            System.out.println(livro); // Imprime cada nome de livro
        }
    }
}
