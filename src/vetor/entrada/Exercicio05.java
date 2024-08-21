package vetor.entrada;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] filmes = new String[4];

        // Entrada de dados
        for (int i = 0; i < filmes.length; i++) {
            System.out.print("Digite o filme " + (i + 1) + ": ");
            filmes[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String filme : filmes) {
            System.out.println("Os filmes do vetor são: " + filme);
        }

        scanner.close();

    }
}
