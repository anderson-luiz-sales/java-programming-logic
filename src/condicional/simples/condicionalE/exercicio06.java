package condicional.simples.condicionalE;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TCC apresentado? (s/n):");
        char tccApresentado = scanner.next().charAt(0);

        System.out.println("Nota do TCC:");
        double notaTCC = scanner.nextDouble();

        if (tccApresentado == 's' && notaTCC >= 7.0) {
            System.out.println("Estudante apto para aprovação no TCC.");
        }
        if (!(tccApresentado == 's' && notaTCC >= 7.0)) {
            System.out.println("Estudante não apto para aprovação no TCC.");
        }

        scanner.close();
    }
}
