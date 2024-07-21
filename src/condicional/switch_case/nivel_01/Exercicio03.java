package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int cor = scanner.nextInt();

        switch (cor) {
            case 1:
                System.out.println("Vermelho");
                break;
            case 2:
                System.out.println("Amarelo");
                break;
            case 3:
                System.out.println("Verde");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
