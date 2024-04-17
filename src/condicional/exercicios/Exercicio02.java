package condicional.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reserva de passagens!");
        System.out.println("Por favor, insira o tipo de assento (Econômico, Executivo ou Primeira Classe):");
        String tipoAssento = scanner.nextLine();

        System.out.println("O destino da viagem é nacional ou internacional? (Nacional / Internacional):");
        String destino = scanner.nextLine();

        double precoBase;
        double desconto = 0;

        switch (tipoAssento.toLowerCase()) {
            case "econômico":
                precoBase = 500.00;
                if (destino.equals("nacional")) {
                    desconto = 0.10;
                }
                break;
            case "executivo":
                precoBase = 800.00;
                if (destino.equals("internacional")) {
                    desconto = 0.05;
                }
                break;
            case "primeira classe":
                precoBase = 1200.00;
                if (destino.equals("internacional")) {
                    desconto = 0.15;
                }
                break;
            default:
                System.out.println("Tipo de assento inválido!");
                return;
        }

        double valorDesconto = precoBase * desconto;
        double valorFinal = precoBase - valorDesconto;

        System.out.println("O preço final da passagem é: R$ " + valorFinal);

        scanner.close();
    }
}
