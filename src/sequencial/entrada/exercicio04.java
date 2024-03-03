package sequencial.entrada;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);

        int codigoFilme;
        String nomeFilme;
        String generoFilme;
        int anoLancamento;
        double precoIngresso;

        System.out.println("Informe o código do filme:");
        codigoFilme = sc.nextInt();

        System.out.println("Informe o nome do filme:");
        sc.nextLine();
        nomeFilme = sc.nextLine();

        System.out.println("Informe o gênero do filme:");
        generoFilme = sc.nextLine();

        System.out.println("Informe o ano de lançamento do filme:");
        anoLancamento = sc.nextInt();

        System.out.println("Informe o preço do ingresso do filme:");
        precoIngresso = sc.nextDouble();

        System.out.println();

        System.out.println("Os valores digitados são:");
        System.out.println("Código do filme: " + codigoFilme);
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Gênero do filme: " + generoFilme);
        System.out.println("Ano de lançamento do filme: " + anoLancamento);
        System.out.println("Preço do ingresso do filme: " + precoIngresso);

        sc.close();
    }
}
