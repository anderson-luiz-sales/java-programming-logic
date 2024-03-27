package condicional.simples.condicional_e;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade do interessado:");
        int idade = scanner.nextInt();

        System.out.println("Restrição médica para a prática de exercícios? (s/n):");
        char restricaoMedica = scanner.next().charAt(0);

        if (idade > 18 && restricaoMedica == 'n') {
            System.out.println("Inscrever-se na academia de ginástica.");
        }
        if (!(idade > 18 && restricaoMedica == 'n')) {
            System.out.println("Não se inscrever na academia de ginástica.");
        }

        scanner.close();
    }
}
