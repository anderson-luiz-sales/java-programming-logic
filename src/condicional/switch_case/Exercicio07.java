package condicional.switch_case;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Transportadora!");
        System.out.println("Por favor, selecione o tipo de veículo:");
        System.out.println("C - Caminhão");
        System.out.println("V - Van");
        System.out.println("A - Carro");
        char tipoVeiculo = scanner.next().charAt(0);

        System.out.println("Informe a distância a ser percorrida em quilômetros:");
        double distancia = scanner.nextDouble();

        double custoTotal;

        switch (tipoVeiculo) {
            case 'C':
                custoTotal = 2.00 * distancia;
                break;
            case 'V':
                custoTotal = 2.50 * distancia;
                break;
            case 'A':
                custoTotal = 3.00 * distancia;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O custo total do frete é: R$ " + custoTotal);
    }
}
