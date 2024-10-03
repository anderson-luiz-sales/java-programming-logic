package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();
        int contador = 1;

        do {
            int resultado = numero * contador; // Calcula o resultado da tabuada
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);

        scanner.close();
    }
}

