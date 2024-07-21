package condicional.switch_case.nivel_02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Loja de Doces!");
        System.out.println("Por favor, selecione o tipo de doce:");
        System.out.println("1 - Bala");
        System.out.println("2 - Chocolate");
        System.out.println("3 - Pirulito");
        int tipoDoce = scanner.nextInt();

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();

        double precoTotal;
        String nomeDoce;

        switch (tipoDoce) {
            case 1:
                precoTotal = 0.50 * quantidade;
                nomeDoce = "Bala";
                break;
            case 2:
                precoTotal = 1.00 * quantidade;
                nomeDoce = "Chocolate";
                break;
            case 3:
                precoTotal = 0.75 * quantidade;
                nomeDoce = "Pirulito";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O preço total de " + quantidade + " " + nomeDoce + "(s) é: R$ " + precoTotal);
    }
}
