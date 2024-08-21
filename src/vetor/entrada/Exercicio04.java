package vetor.entrada;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animais = new String[5];

        // Entrada de dados
        for (int i = 0; i < animais.length; i++) {
            System.out.print("Digite o animal " + (i + 1) + ": ");
            animais[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String animal : animais) {
            System.out.println("Os animais do vetor são: " + animal);
        }

        scanner.close();
    }
}
