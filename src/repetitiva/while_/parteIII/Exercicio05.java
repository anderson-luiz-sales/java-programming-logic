package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Contagem regressiva:");
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        scanner.close();
    }
}
