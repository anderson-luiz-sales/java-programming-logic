package condicional.simples.condicional_ou_extra;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da barra de chocolate (em gramas):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a porcentagem de cacau presente na barra de chocolate:");
        double porcentagemCacau = scanner.nextDouble();

        if (peso < 80 || porcentagemCacau < 70) {
            System.out.println("Alerta: barra de chocolate fora dos padrões de qualidade.");
        } else {
            System.out.println("Barra de chocolate dentro dos padrões de qualidade.");
        }

        scanner.close();
    }
}
