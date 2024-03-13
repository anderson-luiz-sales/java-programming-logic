package condicional.simples.condicionalOu;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite a frequência do aluno (%): ");
        double frequencia = scanner.nextDouble();

        if (nota >= 7 || frequencia >= 75) {
            System.out.println("Aprovado");
        }

        if (!(nota >= 7 || frequencia >= 75)) {
            System.out.println("Reprovado");
        }
    }
}

