package condicional.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de aluguel de carros!");
        System.out.println("Por favor, insira o tipo de carro (Compacto, Médio ou Luxo):");
        String tipoCarro = scanner.nextLine();

        System.out.println("Insira a quantidade de dias de aluguel:");
        int diasAluguel = scanner.nextInt();

        double precoBase;
        double desconto = 0;

        if (tipoCarro.equals("compacto")) {
            precoBase = 100.00;
        } else if (tipoCarro.equals("médio")) {
            precoBase = 150.00;
        } else if (tipoCarro.equals("luxo")) {
            precoBase = 250.00;
        } else {
            System.out.println("Tipo de carro inválido!");
            scanner.close();
            return;
        }

        double valorTotal = precoBase * diasAluguel;

        if (diasAluguel > 7) {
            desconto = 0.15;
        } else if (diasAluguel > 3) {
            desconto = 0.10;
        }

        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("O preço final do aluguel é: R$ " + valorFinal);

        scanner.close();
    }
}
