package condicional.simples.condicionalE;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marca do notebook:");
        String marca = scanner.nextLine();

        System.out.println("Valor do notebook:");
        double valor = scanner.nextDouble();

        if (marca.equalsIgnoreCase("Dell") && valor < 3000) {
            System.out.println("Comprar notebook.");
        }
        if (!(marca.equalsIgnoreCase("Dell") && valor < 3000)) {
            System.out.println("Não comprar notebook.");
        }

        scanner.close();
    }
}
