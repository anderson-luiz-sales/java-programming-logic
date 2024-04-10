package condicional.switch_case;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Pedidos!");
        System.out.println("Por favor, selecione o item desejado:");
        System.out.println("1. Hambúrguer Simples - R$ 10.00");
        System.out.println("2. Cheeseburger - R$ 12.00");
        System.out.println("3. Batata Frita - R$ 5.00");
        System.out.println("4. Refrigerante - R$ 3.00");
        int item = scanner.nextInt();

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();
        double valorTotal;
        double valorItem;

        switch (item) {
            case 1:
                valorItem = 10.00;
                valorTotal = valorItem * quantidade;
                break;
            case 2:
                valorItem = 12.00;
                valorTotal = valorItem * quantidade;
                break;
            case 3:
                valorItem = 5.00;
                valorTotal = valorItem * quantidade;
                break;
            case 4:
                valorItem = 3.00;
                valorTotal = valorItem * quantidade;
                break;
            default:
                System.out.println("Item inválido!");
                return;
        }

        System.out.println("Valor total do pedido: R$ " + valorTotal);
    }
}
