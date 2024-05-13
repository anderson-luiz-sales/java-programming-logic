package repetitiva.while_.parte_II;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNotas = 0;
        double somaNotas = 0;
        System.out.println("Digite as notas do aluno (0 a 10). Insira um valor fora desse intervalo para encerrar: ");

        while (true) {
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                continue; // Solicita novamente a nota
            }

            totalNotas++;
            somaNotas = somaNotas + nota;

            System.out.print("Deseja inserir outra nota? (S/N): ");
            String continuar = sc.next();

            if (!continuar.equals("S")) {
                break;
            }
        }

        if (totalNotas == 0) {
            System.out.println("Nenhuma nota foi inserida.");
        } else {
            double media = somaNotas / totalNotas;
            System.out.println("A média das notas é: " + media);
        }

        sc.close();
    }
}