package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEspecifico;
        int contador = 1;

        System.out.println("Por favor, insira um número inteiro positivo:");
        numeroEspecifico = scanner.nextInt();

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= numeroEspecifico);

        System.out.println("Contagem completa até " + numeroEspecifico + ".");
        scanner.close();
    }
}
