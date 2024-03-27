package condicional.simples.condicional_ou;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 60 || idade > 60) {
            System.out.println("Pode se aposentar");
        }

        if (!(idade >= 60 || idade > 60)) {
            System.out.println("Não pode se aposentar");
        }
    }
}

