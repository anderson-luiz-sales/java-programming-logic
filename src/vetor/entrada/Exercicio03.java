package vetor.entrada;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cidades = new String[6];

        // Entrada de dados
        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Digite a cidade " + (i + 1) + ": ");
            cidades[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String cidade : cidades) {
            System.out.println("As cidades do vetor são: " + cidade);
        }

        scanner.close();
    }
}
