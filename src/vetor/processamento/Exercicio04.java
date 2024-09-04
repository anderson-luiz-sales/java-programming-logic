package vetor.processamento;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3]; // Cria um vetor de tamanho 3

        System.out.println("Insira 3 números:");

        // Laço para capturar os 3 números
        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Insira uma porcentagem: ");
        double porcentagem = scanner.nextDouble();

        // Calcula e exibe a porcentagem para cada número
        for (int i = 0; i < 3; i++) {
            double valorPorcentagem = (porcentagem / 100) * numeros[i]; // Calcula o valor da porcentagem
            System.out.printf("%.1f%% de %d é %.1f%n", porcentagem, numeros[i], valorPorcentagem);
        }
    }
}
