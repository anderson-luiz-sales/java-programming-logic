package repetitiva.while_.parte_I;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            // Solicitação dos números
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            // Realização da operação escolhida
            double resultado = 0;
            switch (opcao) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            // Exibição do resultado
            System.out.println("Resultado: " + resultado);

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
