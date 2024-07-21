package repetitiva.for_;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / quantidade;
        System.out.println("A média dos números inseridos é: " + media);

        scanner.close();
    }
}
