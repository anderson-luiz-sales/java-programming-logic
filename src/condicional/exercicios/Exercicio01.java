package condicional.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de controle de estacionamento!");
        System.out.println("Por favor, insira o tipo de cliente (1 - Regular, 2 - VIP ou 3 - Premium):");

        int tipoCliente = scanner.nextInt();

        System.out.println("Insira o tempo de permanência em horas:");
        int tempoPermanencia = scanner.nextInt();

        double taxaPorHora;
        double desconto = 0;

        switch (tipoCliente) {
            case 1:
                taxaPorHora = 5.00;
                if (tempoPermanencia > 5) {
                    desconto = 0.05;
                }
                break;
            case 2:
                taxaPorHora = 4.00;
                if (tempoPermanencia > 4) {
                    desconto = 0.10;
                }
                break;
            case 3:
                taxaPorHora = 3.00;
                if (tempoPermanencia > 3) {
                    desconto = 0.15;
                }
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
                return;
        }

        double valorTotal = taxaPorHora * tempoPermanencia;
        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Valor total a ser pago: R$ " + valorFinal);

        scanner.close();
    }
}
