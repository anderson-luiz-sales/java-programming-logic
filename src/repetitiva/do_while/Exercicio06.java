package repetitiva.do_while;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor, insira um número par:");
            numero = scanner.nextInt();

            if (numero % 2 != 0) {
                System.out.println("Número ímpar inserido. Encerrando o programa.");
                break;  // Encerra o loop caso o número inserido seja ímpar
            }
        } while (true);  // Loop continua até que um número ímpar seja inserido

        scanner.close();
    }
}
