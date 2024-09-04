package vetor.processamento;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] estoque = new int[5]; // Cria um vetor de tamanho 5
        int total = 0; // Inicializa o total como 0

        System.out.println("Insira a quantidade de 5 produtos:");

        // Laço para capturar as quantidades dos 5 produtos
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
            total += estoque[i]; // Adiciona a quantidade ao total
        }

        // Exibe o total de itens em estoque
        System.out.println("Total de itens em estoque: " + total);
    }
}
