package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int i = 1;

        System.out.println("Contando até " + numero + ":");
        while (i <= numero) {
            // Verifica se o número não é 2, 5, 9 ou 16
            if (i != 2 && i != 5 && i != 9 && i != 16) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}
