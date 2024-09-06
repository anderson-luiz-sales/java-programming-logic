package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int i = 0;
        int contadorVogais = 0;

        while (i < frase.length()) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contadorVogais++;
            }
            i++;
        }

        System.out.println("Total de vogais: " + contadorVogais);

        scanner.close();
    }
}
