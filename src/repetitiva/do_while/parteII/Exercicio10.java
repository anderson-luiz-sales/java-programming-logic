package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Você gosta de números? (s/n): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Que ótimo! Números são muito interessantes!");
            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Tudo bem! Cada um tem suas preferências.");
            } else {
                System.out.println("Por favor, responda com 's' ou 'n'.");
            }
        } while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));

        scanner.close();
    }
}
