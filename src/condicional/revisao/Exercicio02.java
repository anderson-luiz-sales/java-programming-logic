package condicional.revisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Ambos são positivos");
        } else {
            System.out.println("Pelo menos um não é positivo");
        }
    }
}
