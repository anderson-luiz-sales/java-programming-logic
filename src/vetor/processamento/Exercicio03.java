package vetor.processamento;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0; // Inicializa a soma como 0

        System.out.println("Insira 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i]; // Adiciona cada número à soma
        }

        double media = soma / 5.0; // Calcula a média (divisão por 5.0 para obter resultado em ponto flutuante)

        System.out.println("A média dos elementos é: " + media);
    }
}
