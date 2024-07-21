package condicional.revisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        int temperatura = scanner.nextInt();

        System.out.print("Digite a umidade: ");
        int umidade = scanner.nextInt();

        if (temperatura > 25 && umidade > 70) {
            System.out.println("Tempo quente e úmido");
        } else if (temperatura <= 15 || umidade < 30) {
            System.out.println("Tempo frio ou seco");
        } else {
            System.out.println("Tempo agradável");
        }
    }
}
