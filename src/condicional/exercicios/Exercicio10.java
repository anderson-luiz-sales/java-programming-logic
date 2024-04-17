package condicional.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de vendas!");
        System.out.println("Por favor, insira a categoria do produto (A, B ou C):");
        String categoria = scanner.nextLine();

        System.out.println("Insira o valor total da compra:");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;

        if (categoria.equalsIgnoreCase("A")) {
            desconto = 0.10;
        } else if (categoria.equalsIgnoreCase("B")) {
            desconto = 0.15;
        } else if (categoria.equalsIgnoreCase("C")) {
            desconto = 0.20;
        } else {
            System.out.println("Categoria de produto inválida!");
            return;
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("O valor final da compra é: R$" + valorFinal);

        scanner.close();
    }
}
