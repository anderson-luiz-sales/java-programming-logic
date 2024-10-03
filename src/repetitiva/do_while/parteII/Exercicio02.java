package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        int contador = 1;

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= numero);

        scanner.close();
    }
}
