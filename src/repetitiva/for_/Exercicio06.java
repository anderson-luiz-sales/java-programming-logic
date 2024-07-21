package repetitiva.for_;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
