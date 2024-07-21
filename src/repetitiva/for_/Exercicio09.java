package repetitiva.for_;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        int porcentagem = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            double aumento = valorInicial * porcentagem / 100.0;
            valorInicial += aumento;
            System.out.println("Após " + i + " anos: " + valorInicial);
        }

        scanner.close();
    }
}
