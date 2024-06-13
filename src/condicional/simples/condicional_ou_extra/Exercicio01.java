package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        if (nota1 >= 7.0 || nota2 >= 7.0) {
            System.out.println("Parabéns! Você está aprovado.");
        } else {
            System.out.println("Infelizmente você não atingiu a nota mínima em ambas as provas.");
        }

        scanner.close();
    }
}
