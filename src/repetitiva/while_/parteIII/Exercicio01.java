package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int i = 1;

        System.out.println("Contando até " + numero + ":");
        while (i <= numero) {
            System.out.println(i);
            i++;
        }

        scanner.close();
    }
}
