package condicional.simples.condicional_e;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliação:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda avaliação:");
        double nota2 = scanner.nextDouble();

        if (nota1 >= 7.0 && nota2 >= 7.0) {
            System.out.println("O aluno está aprovado.");
        }

        if (!(nota1 >= 7.0 && nota2 >= 7.0)) {
            System.out.println("O aluno está reprovado.");
        }

        scanner.close();
    }
}
