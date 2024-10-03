package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Usando do while para a contagem regressiva
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);

        System.out.println("Feliz Ano Novo!");

        scanner.close();
    }
}
