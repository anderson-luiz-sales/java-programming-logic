package repetitiva.while_.parteIII;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroMagico = random.nextInt(10) + 1; // Gera um número entre 1 e 10
        int palpite = 0;

        System.out.println("Adivinhe o número mágico entre 1 e 10:");

        while (palpite != numeroMagico) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroMagico) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroMagico) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número mágico!");
            }
        }

        scanner.close();
    }
}
