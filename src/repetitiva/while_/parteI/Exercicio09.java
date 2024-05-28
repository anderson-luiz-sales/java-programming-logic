package repetitiva.while_.parteI;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo N
        System.out.print("Insira um número inteiro positivo: ");
        int N = scanner.nextInt();

        // Inicializa o contador
        int i = 1;

        // Exibe todos os números pares de 1 até N
        System.out.println("Números pares de 1 até " + N + ":");

        while (i <= N) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        scanner.close();
    }
}
