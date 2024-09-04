package vetor.processamento;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] estoque = new int[3];  // Cria um vetor para estoque
        int[] vendidos = new int[3];  // Cria um vetor para quantidades vendidas
        int totalRestante = 0;  // Inicializa a quantidade total restante como 0

        // Coleta as quantidades em estoque
        System.out.println("Insira a quantidade em estoque de 3 produtos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
        }

        // Coleta as quantidades vendidas
        System.out.println("Insira a quantidade vendida de 3 produtos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            vendidos[i] = scanner.nextInt();
        }

        // Exibe as quantidades restantes de cada produto
        System.out.println("Quantidades restantes de produtos:");
        for (int i = 0; i < 3; i++) {
            int restante = estoque[i] - vendidos[i];  // Calcula a quantidade restante
            totalRestante += restante;  // Adiciona à quantidade total restante
            System.out.printf("Produto %d: %d%n", i + 1, restante);
        }

        // Exibe a quantidade total restante em estoque
        System.out.printf("Quantidade total restante em estoque: %d%n", totalRestante);
    }
}
