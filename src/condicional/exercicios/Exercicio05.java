package condicional.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de venda de produtos!");
        System.out.println("Por favor, insira o tipo de produto (Eletr�nicos, Vestu�rio ou Alimentos):");
        String tipoProduto = scanner.nextLine();

        System.out.println("Insira a quantidade adquirida:");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        double desconto = 0;

        if (tipoProduto.equals("eletr�nicos")) {
            precoUnitario = 100.00;
        } else if (tipoProduto.equals("vestu�rio")) {
            precoUnitario = 50.00;
        } else if (tipoProduto.equals("alimentos")) {
            precoUnitario = 20.00;
        } else {
            System.out.println("Tipo de produto inv�lido!");
            return;
        }

        double precoTotal = precoUnitario * quantidade;

        switch (quantidade) {
            case 5:
                desconto = 0.10;
                break;
            case 10:
                desconto = 0.15;
                break;
        }

        double valorDesconto = precoTotal * desconto;
        double valorFinal = precoTotal - valorDesconto;

        System.out.println("O pre�o final da compra �: R$" + valorFinal);

        scanner.close();
    }
}
