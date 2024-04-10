package condicional.switch_case;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Loja de Roupas!");
        System.out.println("Por favor, selecione o tipo de peça de roupa:");
        System.out.println("C - Camiseta");
        System.out.println("L - Calça");
        System.out.println("S - Casaco");
        char tipoPeca = scanner.next().charAt(0);

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();

        double precoTotal;

        switch (tipoPeca) {
            case 'C':
                precoTotal = 30.00 * quantidade;
                break;
            case 'L':
                precoTotal = 50.00 * quantidade;
                break;
            case 'S':
                precoTotal = 80.00 * quantidade;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O preço total da compra é: R$ " + precoTotal);
    }
}
