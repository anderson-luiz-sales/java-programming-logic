package repetitiva.for_;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
