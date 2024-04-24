package sequencial.entrada;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);
        int codigoProduto;
        String nomeProduto;
        String categoriaProduto;
        double precoProduto;

        System.out.println("Informe o código do produto:");
        codigoProduto = sc.nextInt();

        System.out.println("Informe o nome do produto:");
        nomeProduto = sc.next();

        System.out.println("Informe a categoria do produto:");
        categoriaProduto = sc.next();

        System.out.println("Informe o preço do produto:");
        precoProduto = sc.nextDouble();

        System.out.println("\nValores digitados:");
        System.out.println("Código do produto: " + codigoProduto);
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Categoria do produto: " + categoriaProduto);
        System.out.println("Preço do produto: " + precoProduto);

        sc.close();
    }
}
