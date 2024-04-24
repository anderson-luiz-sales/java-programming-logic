package sequencial.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double primeroNota;
        double segundaNota;
        double terceiraNota;
        double media;

        System.out.println("Digite a primeira nota");
        primeroNota = sc.nextDouble();

        System.out.println("Digite a segunda nota");
        segundaNota = sc.nextDouble();

        System.out.println("Digite a terceira nota");
        terceiraNota = sc.nextDouble();

        media = (primeroNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A média das notas é: %.2f", media);

        sc.close();
    }
}
