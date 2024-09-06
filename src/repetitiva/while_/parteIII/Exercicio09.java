package repetitiva.while_.parteIII;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número (ou 0 para parar): ");
        int numero = scanner.nextInt();

        int resultado = 1; // Inicializa o resultado da multiplicação

        while (numero != 0) {
            resultado *= numero; // Multiplica o número atual ao resultado
            System.out.println("Resultado atual: " + resultado);
            System.out.print("Digite um número (ou 0 para parar): ");
            numero = scanner.nextInt();
        }

        System.out.println("Resultado final: " + resultado);

        scanner.close();
    }
}
