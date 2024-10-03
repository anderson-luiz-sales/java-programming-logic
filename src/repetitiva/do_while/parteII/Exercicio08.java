package repetitiva.do_while.parteII;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroCorreto = random.nextInt(5) + 1; // Gera um número entre 1 e 5
        int palpite;

        do {
            System.out.print("Adivinhe um número entre 1 e 5: ");
            palpite = scanner.nextInt();

            if (palpite != numeroCorreto) {
                System.out.println("Tente novamente!");
            }
        } while (palpite != numeroCorreto);

        System.out.println("Parabéns! Você acertou o número: " + numeroCorreto);

        scanner.close();
    }
}
