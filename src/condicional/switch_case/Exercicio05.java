package condicional.switch_case;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca!");
        System.out.println("Por favor, selecione o tipo de livro:");
        System.out.println("C - Livro Comum");
        System.out.println("A - Livro Acadêmico");
        System.out.println("I - Livro Infantil");
        char tipoLivro = scanner.next().charAt(0);

        System.out.println("Informe o número de dias de atraso:");
        int diasAtraso = scanner.nextInt();

        double multa;

        switch (tipoLivro) {
            case 'C':
                multa = 0.50 * diasAtraso;
                break;
            case 'A':
                multa = 1.00 * diasAtraso;
                break;
            case 'I':
                multa = 0.25 * diasAtraso;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("A multa a ser paga é: R$ " + multa);
    }
}
