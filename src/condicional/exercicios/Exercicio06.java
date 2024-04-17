package condicional.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reservas de quartos!");
        System.out.println("Por favor, insira o tipo de quarto (Standard, Luxo ou Su�te Presidencial):");
        String tipoQuarto = scanner.nextLine();

        System.out.println("Insira o n�mero de di�rias desejadas:");
        int numeroDiarias = scanner.nextInt();

        double precoDiaria;
        double desconto = 0;

        if (tipoQuarto.equalsIgnoreCase("standard")) {
            precoDiaria = 150.00;
        } else if (tipoQuarto.equalsIgnoreCase("luxo")) {
            precoDiaria = 300.00;
        } else if (tipoQuarto.equalsIgnoreCase("su�te presidencial")) {
            precoDiaria = 500.00;
        } else {
            System.out.println("Tipo de quarto inv�lido!");
            return;
        }

        double precoTotal = precoDiaria * numeroDiarias;

        if (numeroDiarias > 10) {
            desconto = 0.15;
        } else if (numeroDiarias > 5) {
            desconto = 0.10;
        }

        double valorDesconto = precoTotal * desconto;
        double valorFinal = precoTotal - valorDesconto;

        System.out.println("O pre�o final da estadia �: R$" + valorFinal);

        scanner.close();
    }
}
