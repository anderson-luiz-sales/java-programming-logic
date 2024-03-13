package condicional.simples.condicionalOu;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 || numero % 5 == 0) {
            System.out.println("Múltiplo de 3 ou de 5");
        }

        if (!(numero % 3 == 0 || numero % 5 == 0)) {
            System.out.println("Não é múltiplo de 3 nem de 5");
        }
    }
}

