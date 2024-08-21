package vetor.entrada;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] musicas = new String[5];

        // Entrada de dados
        for (int i = 0; i < musicas.length; i++) {
            System.out.print("Digite a música favorita " + (i + 1) + ": ");
            musicas[i] = scanner.nextLine();
        }

        // Saída de dados
        for (String musica : musicas) {
            System.out.println("As músicas favoritas do vetor são: " + musica);
        }

        scanner.close();
    }
}
