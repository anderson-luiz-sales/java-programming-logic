package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int multiplicador = 1;

        System.out.println("Por favor, insira um número inteiro para calcular a tabuada:");
        numero = scanner.nextInt();

        System.out.println("Tabuada do número " + numero + ":\n");

        do {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        } while (multiplicador <= 10);

        scanner.close();
    }
}
