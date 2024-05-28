package repetitiva.while_.parteI;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int i = 2;
        while (i <= numero) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("Fim do programa");
        scanner.close();
    }
}
