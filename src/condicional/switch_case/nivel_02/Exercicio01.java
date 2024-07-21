package condicional.switch_case.nivel_02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora de Desconto!");
        System.out.println("Informe o tipo de cliente:");
        System.out.println("1 - Regular");
        System.out.println("2 - VIP");
        System.out.println("3 - Premium");
        int tipoCliente = scanner.nextInt();

        System.out.println("Informe o valor total da compra:");
        double valorCompra = scanner.nextDouble();

        double desconto;

        switch (tipoCliente) {
            case 1:
                desconto = valorCompra * 0.10;
                break;
            case 2:
                desconto = valorCompra * 0.15;
                break;
            case 3:
                desconto = valorCompra * 0.20;
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        double valorFinal = valorCompra - desconto;
        System.out.println("O valor final da compra com desconto é: R$ " + valorFinal);
    }
}
