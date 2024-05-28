package repetitiva.while_.parteII;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavras = "";
        boolean primeiraPalavra = true;

        while (true) {
            System.out.print("Digite uma palavra (ou 'sair' para terminar): ");
            String palavra = scanner.nextLine();

            if (palavra.equals("sair")) {
                break;
            }

            if (primeiraPalavra) {
                palavras = palavra;
                primeiraPalavra = false;
            } else {
                palavras = palavras + ", " + palavra;
            }
        }

        if (palavras.isEmpty()) {
            System.out.println("Nenhuma palavra foi inserida.");
        } else {
            System.out.println("Palavras inseridas: " + palavras);
        }

        scanner.close();
    }
}
