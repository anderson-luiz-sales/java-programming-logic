package repetitiva.while_;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa um valor: ");
        int valor = sc.nextInt();

        int mult = 1;

        while (valor != 0) {
            mult = mult * valor;
            valor = sc.nextInt();
        }

        System.out.println("A multplicação dos valores é: " + mult);
        System.out.println("Fim do programa");

        sc.close();
    }
}
