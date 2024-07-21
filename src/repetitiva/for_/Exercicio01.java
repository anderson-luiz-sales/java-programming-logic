package repetitiva.for_;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = numero * i;
            System.out.println(numero + " x " + i + " = " + produto);
        }

        scanner.close();
    }
}
