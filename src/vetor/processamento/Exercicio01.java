package vetor.processamento;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Insira 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}
