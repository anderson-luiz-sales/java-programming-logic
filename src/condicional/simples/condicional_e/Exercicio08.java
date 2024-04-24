package condicional.simples.condicional_e;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idade do candidato:");
        int idade = scanner.nextInt();

        System.out.println("Condição física do candidato? (s/n):");
        char condicaoFisica = scanner.next().charAt(0);

        if (idade < 70 && condicaoFisica == 's') {
            System.out.println("Inscrever-se para a viagem espacial.");
        }
        if (!(idade < 70 && condicaoFisica == 's')) {
            System.out.println("Não se inscrever para a viagem espacial.");
        }

        scanner.close();
    }
}
