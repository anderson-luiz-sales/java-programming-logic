package repetitiva.do_while.parteII;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        String respostaCorreta = "maçã"; // Resposta correta

        do {
            System.out.print("Qual é a fruta que é vermelha e pode ser usada em tortas? ");
            resposta = scanner.nextLine();

            if (resposta.equals(respostaCorreta)) {
                System.out.println("Parabéns! Você acertou!");
            } else {
                System.out.println("Tente novamente!");
            }
        } while (!resposta.equals(respostaCorreta));

        scanner.close();
    }
}
