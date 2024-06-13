package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o turno de trabalho do funcionário (1 = Manhã, 2 = Tarde, 3 = Noite):");
        int turno = scanner.nextInt();

        if (turno == 1 || turno == 2) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
