package vetor.entrada;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[5];

        // Entrada de dados
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Digite a fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String fruta : frutas) {
            System.out.println("As frutas do vetor são: " + fruta);
        }

        scanner.close();

    }
}
