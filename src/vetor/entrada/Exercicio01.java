package vetor.entrada;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];

        // Entrada de dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Saída de dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Os nomes do vetor são: " + nomes[i]);
        }

        scanner.close();
    }
}
