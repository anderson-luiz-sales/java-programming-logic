package sequencial.entrada;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);

        long codigoGame;
        String nomeGame;
        String seguimentoGame;
        String dataLancementoGame;
        double valorGame;

        System.out.println("Informe o código do jogo");
        codigoGame = sc.nextLong();

        System.out.println("Informe o nome do jogo");
        sc.nextLine();
        nomeGame = sc.nextLine();

        System.out.println("Informe o seguimento do jogo");
        seguimentoGame = sc.nextLine();

        System.out.println("Informe a data de lancemento do jogo");
        dataLancementoGame = sc.nextLine();

        System.out.println("Informe o valor do jogo");
        valorGame = sc.nextDouble();

        System.out.println();

        System.out.println("Os valores digitados são:");

        System.out.println("Codigo do jogo  = " + codigoGame);
        System.out.println("Nome do jogo = " + nomeGame);
        System.out.println("Seguimneto do jogo = " + seguimentoGame);
        System.out.println("Data de lancamento do jogo = " + dataLancementoGame);
        System.out.println("Valor do jogo = " + valorGame);

        sc.close();
    }
}
