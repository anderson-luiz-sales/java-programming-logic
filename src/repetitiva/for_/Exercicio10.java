package repetitiva.for_;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        int porcentagem = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            double desconto = valorInicial * porcentagem / 100.0;
            valorInicial -= desconto;
            System.out.println("Após " + i + " aplicação" + (i == 1 ? " " : "s ") + "de desconto: " + valorInicial);
        }

        scanner.close();
    }
}
