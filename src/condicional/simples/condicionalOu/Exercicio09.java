package condicional.simples.condicionalOu;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 != 0 || (numero >= 100 && numero <= 200)) {
            System.out.println("Número válido");
        }

        if (!(numero % 2 != 0 || (numero >= 100 && numero <= 200))) {
            System.out.println("Número inválido");
        }
    }
}

