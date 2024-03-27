package condicional.simples.condicional_e;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota de Matemática:");
        double matematica = scanner.nextDouble();

        System.out.println("Digite a nota de Português:");
        double portugues = scanner.nextDouble();

        System.out.println("Digite a nota de Ciências:");
        double ciencias = scanner.nextDouble();

        if (matematica >= 9.0 && portugues >= 9.0 && ciencias >= 9.0) {
            System.out.println("Elegível para bolsa de estudos.");
        }
        if (!(matematica >= 9.0 && portugues >= 9.0 && ciencias >= 9.0)) {
            System.out.println("Não elegível para bolsa de estudos.");
        }

        scanner.close();
    }
}
