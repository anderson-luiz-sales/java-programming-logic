package sequencial.entrada;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);
        String tituloLivro;
        String autorLivro;
        String generoLivro;
        int anoPublicacaoLivro;
        double precoLivro;

        System.out.println("Informe o título do livro:");
        tituloLivro = sc.nextLine();

        System.out.println("Informe o autor do livro:");
        autorLivro = sc.nextLine();

        System.out.println("Informe o gênero do livro:");
        generoLivro = sc.nextLine();

        System.out.println("Informe o ano de publicação do livro:");
        anoPublicacaoLivro = sc.nextInt();

        System.out.println("Informe o preço do livro:");
        precoLivro = sc.nextDouble();

        System.out.println("\nInformações do livro registradas com sucesso:");
        System.out.println("Título: " + tituloLivro);
        System.out.println("Autor: " + autorLivro);
        System.out.println("Gênero: " + generoLivro);
        System.out.println("Ano de Publicação: " + anoPublicacaoLivro);
        System.out.println("Preço: " + precoLivro);

        sc.close();
    }
}
