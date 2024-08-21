package vetor.entrada;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] livros = new String[5];

        // Entrada de dados
        for (int i = 0; i < livros.length; i++) {
            System.out.print("Digite o livro " + (i + 1) + ": ");
            livros[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String livro : livros) {
            System.out.println("Os livros do vetor são: " + livro);
        }

        scanner.close();
    }
}
