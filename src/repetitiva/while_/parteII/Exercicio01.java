package repetitiva.while_.parteII;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Insira uma nota (0 a 10) ou um valor fora desse intervalo para parar: ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                // Se a nota estiver fora do intervalo de 0 a 10, paramos de pedir notas
                System.out.println("Nenhuma nota válida foi inserida.");
                break;
            }

            // Adicionamos a nota à soma total
            soma = soma + nota;
            // Contamos quantas notas foram inseridas
            contador++;
        }

        if (contador > 0) {
            // Calculamos a média se pelo menos uma nota válida foi inserida
            double media = soma / contador;
            System.out.println("A média das notas inseridas é: " + media);
        }

        scanner.close();
    }
}
