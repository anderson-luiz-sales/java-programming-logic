package vetor.processamento;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[3]; // Cria um vetor para os preços
        int[] quantidades = new int[3]; // Cria um vetor para as quantidades
        double custoTotal = 0; // Inicializa o custo total como 0

        // Coleta os preços dos produtos
        System.out.println("Insira o preço de 3 produtos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Coleta as quantidades dos produtos
        System.out.println("Insira a quantidade de 3 produtos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
        }

        // Exibe o custo total de cada produto
        System.out.println("Custo total de cada produto:");
        for (int i = 0; i < 3; i++) {
            double custoProduto = precos[i] * quantidades[i]; // Calcula o custo do produto
            custoTotal += custoProduto; // Adiciona ao custo total
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, custoProduto);
        }

        // Exibe o custo total de todos os produtos
        System.out.printf("Custo total de todos os produtos: R$ %.2f%n", custoTotal);
    }
}
