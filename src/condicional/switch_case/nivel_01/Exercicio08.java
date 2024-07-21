package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4: ");
        int nivel = scanner.nextInt();

        switch (nivel) {
            case 1:
                System.out.println("Fundamental");
                break;
            case 2:
                System.out.println("Médio");
                break;
            case 3:
                System.out.println("Superior");
                break;
            case 4:
                System.out.println("Pós-graduação");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
