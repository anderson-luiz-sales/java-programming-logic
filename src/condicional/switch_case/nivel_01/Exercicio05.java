package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int faixaEtaria = scanner.nextInt();

        switch (faixaEtaria) {
            case 1:
                System.out.println("Criança");
                break;
            case 2:
                System.out.println("Adolescente");
                break;
            case 3:
                System.out.println("Adulto");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
