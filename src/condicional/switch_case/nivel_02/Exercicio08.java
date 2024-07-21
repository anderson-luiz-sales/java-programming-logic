package condicional.switch_case.nivel_02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Loja de Informática!");
        System.out.println("Por favor, selecione o tipo de dispositivo:");
        System.out.println("L - Laptop");
        System.out.println("S - Smartphone");
        System.out.println("T - Tablet");
        char tipoDispositivo = scanner.next().charAt(0);

        System.out.println("Informe a quantidade desejada:");
        int quantidade = scanner.nextInt();

        double precoTotal;

        switch (tipoDispositivo) {
            case 'L':
                precoTotal = 3000.00 * quantidade;
                break;
            case 'S':
                precoTotal = 1500.00 * quantidade;
                break;
            case 'T':
                precoTotal = 800.00 * quantidade;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O preço total da compra é: R$ " + precoTotal);
    }
}
