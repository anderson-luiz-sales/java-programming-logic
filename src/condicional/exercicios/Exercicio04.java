package condicional.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de venda de ingressos!");
        System.out.println("Por favor, insira o tipo de filme (Normal, 3D ou IMAX):");
        String tipoFilme = scanner.nextLine();

        System.out.println("Insira a idade do cliente:");
        int idadeCliente = scanner.nextInt();

        double precoBase;
        double desconto = 0;

        if (tipoFilme.equals("normal")) {
            precoBase = 20.00;
        } else if (tipoFilme.equals("3D")) {
            precoBase = 25.00;
        } else if (tipoFilme.equals("IMAX")) {
            precoBase = 30.00;
        } else {
            System.out.println("Tipo de filme inválido!");
            scanner.close();
            return;
        }

        if (idadeCliente >= 60) {
            desconto = 0.50;
        } else if (idadeCliente >= 12 && idadeCliente <= 18) {
            desconto = 0.20;
        } else if (idadeCliente < 12) {
            desconto = 0.50;
        }

        double valorDesconto = precoBase * desconto;
        double valorFinal = precoBase - valorDesconto;

        System.out.println("O preço final do ingresso é: R$" + valorFinal);

        scanner.close();
    }
}
