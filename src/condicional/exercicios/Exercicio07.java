package condicional.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reserva de mesas!");
        System.out.println("Por favor, insira o tipo de mesa (Standard, VIP ou Mesa Especial):");
        String tipoMesa = scanner.nextLine();

        System.out.println("Insira o número de pessoas:");
        int numeroPessoas = scanner.nextInt();

        double precoPorPessoa;
        double desconto = 0;

        switch (tipoMesa.toLowerCase()) {
            case "standard":
                precoPorPessoa = 50.00;
                break;
            case "vip":
                precoPorPessoa = 100.00;
                if (numeroPessoas > 4) {
                    desconto = 0.10;
                }
                break;
            case "mesa especial":
                precoPorPessoa = 200.00;
                if (numeroPessoas > 6) {
                    desconto = 0.15;
                }
                break;
            default:
                System.out.println("Tipo de mesa inválido!");
                return;
        }

        double precoTotal = precoPorPessoa * numeroPessoas;
        double valorDesconto = precoTotal * desconto;
        double valorFinal = precoTotal - valorDesconto;

        System.out.println("O preço final da reserva é: R$" + valorFinal);

        scanner.close();
    }
}
