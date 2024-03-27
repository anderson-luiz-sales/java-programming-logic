package condicional.composta.else_if;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para verificar o dia da semana: ");
        int numero = scanner.nextInt();

        String diaSemana;

        if (numero == 1) {
            diaSemana = "segunda-feira";
        } else if (numero == 2) {
            diaSemana = "terça-feira";
        } else if (numero == 3) {
            diaSemana = "quarta-feira";
        } else if (numero == 4) {
            diaSemana = "quinta-feira";
        } else if (numero == 5) {
            diaSemana = "sexta-feira";
        } else if (numero == 6) {
            diaSemana = "sábado";
        } else if (numero == 7) {
            diaSemana = "domingo";
        } else {
            System.out.println("Número inválido! Por favor, insira um número de 1 a 7.");
            scanner.close();
            return;
        }

        System.out.println("O número " + numero + " corresponde a " + diaSemana + ".");

        scanner.close();
    }
}
