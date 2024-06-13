package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade em estoque do produto:");
        int quantidadeEstoque = scanner.nextInt();

        System.out.println("Digite o preço unitário do produto:");
        double precoUnitario = scanner.nextDouble();

        // Verificação de disponibilidade com operador ||
        if (quantidadeEstoque > 0 || precoUnitario <= 100.00) {
            System.out.println("Produto disponível para compra.");
        } else {
            System.out.println("Produto não disponível para compra.");
        }

        scanner.close();
    }
}
