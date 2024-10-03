package repetitiva.do_while.parteI;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, insira um número inteiro:");
            numero = scanner.nextInt();
        } while (numero == 0);  // Este loop continua até que o usuário insira um número diferente de zero

        System.out.println("Você inseriu o número: " + numero);

        scanner.close();
    }
}
