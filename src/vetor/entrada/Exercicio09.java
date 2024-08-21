package vetor.entrada;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] esportes = new String[4];

        // Entrada de dados
        for (int i = 0; i < esportes.length; i++) {
            System.out.print("Digite o esporte " + (i + 1) + ": ");
            esportes[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String esporte : esportes) {
            System.out.println("Os esportes do vetor são: " + esporte);
        }

        scanner.close();
    }
}
