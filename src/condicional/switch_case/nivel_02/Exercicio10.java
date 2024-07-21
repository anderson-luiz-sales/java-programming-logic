package condicional.switch_case.nivel_02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Papelaria!");
        System.out.println("Por favor, selecione o tipo de material escolar:");
        System.out.println("L - Lápis");
        System.out.println("C - Caderno");
        System.out.println("B - Borracha");
        char tipoMaterial = scanner.next().charAt(0);

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();

        double precoTotal;

        switch (tipoMaterial) {
            case 'L':
                precoTotal = 1.00 * quantidade;
                break;
            case 'C':
                precoTotal = 5.00 * quantidade;
                break;
            case 'B':
                precoTotal = 0.50 * quantidade;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O preço total da compra é: R$ " + precoTotal);
    }
}
