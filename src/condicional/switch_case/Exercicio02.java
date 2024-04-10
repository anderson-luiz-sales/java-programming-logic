package condicional.switch_case;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Estimativa de Entrega!");
        System.out.println("Informe a distância até o destino em quilômetros:");
        int distancia = scanner.nextInt();

        System.out.println("Informe o tipo de entrega desejada:");
        System.out.println("1 - Entrega Padrão");
        System.out.println("2 - Entrega Expressa");
        System.out.println("3 - Entrega Prioritária");
        int tipoEntrega = scanner.nextInt();

        int tempoEstimado;

        switch (tipoEntrega) {
            case 1:
                tempoEstimado = 30;
                break;
            case 2:
                tempoEstimado = 20;
                break;
            case 3:
                tempoEstimado = 15;
                break;
            default:
                System.out.println("Tipo de entrega inválido!");
                return;
        }

        System.out.println("O tempo estimado de entrega é de " + tempoEstimado + " minutos para uma distância de " + distancia + " quilômetros.");
    }
}
