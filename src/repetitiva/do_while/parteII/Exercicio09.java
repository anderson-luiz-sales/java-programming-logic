package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        String continuar;

        do {
            System.out.println(contador);
            contador++;

            if (contador <= 10) {
                System.out.print("Você deseja continuar? (s/n): ");
                continuar = scanner.nextLine();
            } else {
                continuar = "n"; // Força o término após contar até 10
            }
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Contagem finalizada!");
        scanner.close();
    }
}
