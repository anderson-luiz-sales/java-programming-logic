package condicional.simples.condicional_e;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Passou na prova escrita? (s/n):");
        char provaEscrita = scanner.next().charAt(0);

        System.out.println("Passou na prova prática? (s/n):");
        char provaPratica = scanner.next().charAt(0);

        if (idade >= 18 && provaEscrita == 's' && provaPratica == 's') {
            System.out.println("O candidato está apto para obter sua habilitação.");
        }
        if (!(idade >= 18 && provaEscrita == 's' && provaPratica == 's')) {
            System.out.println("O candidato não está apto para obter sua habilitação.");
        }

        scanner.close();
    }
}
