package repetitiva.for_;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();

        System.out.print("Digite um número inteiro positivo: ");
        int repeticoes = scanner.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}
