package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEspecifico = 10;  // Número específico para contar até ele
        int contador = 1;  // Começar a contar a partir de 1

        System.out.println("Vamos começar a contar:");

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= numeroEspecifico);

        System.out.println("Contagem completa até " + numeroEspecifico + ".");
        scanner.close();
    }
}
