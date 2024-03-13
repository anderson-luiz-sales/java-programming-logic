package condicional.simples.condicionalE;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("O número " + numero + " é válido (par e múltiplo de 3).");
        }
        if (!(numero % 2 == 0 && numero % 3 == 0)) {
            System.out.println("O número " + numero + " não é válido.");
        }

        scanner.close();
    }
}
