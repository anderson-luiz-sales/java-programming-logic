package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4: ");
        int classificacao = scanner.nextInt();

        switch (classificacao) {
            case 1:
                System.out.println("Livre");
                break;
            case 2:
                System.out.println("12 anos");
                break;
            case 3:
                System.out.println("16 anos");
                break;
            case 4:
                System.out.println("18 anos");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
