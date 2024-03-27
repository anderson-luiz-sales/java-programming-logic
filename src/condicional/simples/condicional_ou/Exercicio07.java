package condicional.simples.condicional_ou;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 18 || idade > 18) {
            System.out.println("Pode dirigir");
        }

        if (!(idade >= 18 || idade > 18)) {
            System.out.println("Não pode dirigir");
        }
    }
}
