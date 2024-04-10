package condicional.switch_case;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Escola!");
        System.out.println("Por favor, selecione o nível do curso:");
        System.out.println("B - Básico");
        System.out.println("I - Intermediário");
        System.out.println("A - Avançado");
        char nivelCurso = scanner.next().charAt(0);

        System.out.println("Informe o número de meses de matrícula desejados:");
        int mesesMatricula = scanner.nextInt();

        double valorTotal;

        switch (nivelCurso) {
            case 'B':
                valorTotal = 100.00 * mesesMatricula;
                break;
            case 'I':
                valorTotal = 150.00 * mesesMatricula;
                break;
            case 'A':
                valorTotal = 200.00 * mesesMatricula;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);
    }
}
