package condicional.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de venda de ingressos!");
        System.out.println("Por favor, insira a idade do visitante:");
        int idade = scanner.nextInt();

        System.out.println("Insira o tipo de ingresso desejado (Normal, VIP ou Premium):");
        String tipoIngresso = scanner.next();

        double precoBase;
        double desconto = 0;

        switch (tipoIngresso.toLowerCase()) {
            case "normal":
                precoBase = 50.00;
                break;
            case "vip":
                precoBase = 80.00;
                break;
            case "premium":
                precoBase = 120.00;
                break;
            default:
                System.out.println("Tipo de ingresso inválido!");
                return;
        }

        if (idade <= 5) {
            precoBase = 0;
        } else if (idade >= 6 && idade <= 12) {
            desconto = 0.50;
        } else if (idade >= 60) {
            desconto = 0.30;
        }

        double precoFinal = precoBase - (precoBase * desconto);

        System.out.println("O preço final do ingresso é: R$" + precoFinal);

        scanner.close();
    }
}
