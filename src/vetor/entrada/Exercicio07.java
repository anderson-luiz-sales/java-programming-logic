package vetor.entrada;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hobbies = new String[5];

        // Entrada de dados
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print("Digite o hobby " + (i + 1) + ": ");
            hobbies[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String hobby : hobbies) {
            System.out.println("Os hobbies do vetor são: " + hobby);
        }

        scanner.close();
    }
}
