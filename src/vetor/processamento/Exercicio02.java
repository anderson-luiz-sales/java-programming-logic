package vetor.processamento;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int produto = 1;

        System.out.println("Insira 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            produto = produto * numeros[i];
        }

        System.out.println("O produto dos elementos é: " + produto);
    }
}
