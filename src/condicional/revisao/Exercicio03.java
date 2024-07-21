package condicional.revisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você possui carteira de motorista? (true/false): ");
        boolean temCarteira = scanner.nextBoolean();

        System.out.print("Você tem mais de 18 anos? (true/false): ");
        boolean maiorDeIdade = scanner.nextBoolean();

        if (temCarteira || maiorDeIdade) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
    }
}
