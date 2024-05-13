package repetitiva.while_.parte_I;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa um valor: ");
        int valor = sc.nextInt();

        int soma = 0;

        while (valor != 0) {
            soma = soma + valor;
            valor = sc.nextInt();
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("Fim do programa");

        sc.close();
    }
}
