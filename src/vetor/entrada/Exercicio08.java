package vetor.entrada;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] comidas = new String[5];

        // Entrada de dados
        for (int i = 0; i < comidas.length; i++) {
            System.out.print("Digite a comida favorita " + (i + 1) + ": ");
            comidas[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String comida : comidas) {
            System.out.println("As comidas favoritas do vetor são: " + comida);
        }

        scanner.close();
    }
}
