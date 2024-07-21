package condicional.revisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura atual em graus Celsius: ");
        int temperatura = scanner.nextInt();

        if (temperatura < 0 || temperatura > 30) {
            System.out.println("Temperatura extrema.");
        } else {
            System.out.println("Temperatura normal.");
        }

    }
}
