package sequencial.entrada;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);

        long codigo;
        String nomeProduto;
        String dataValidade;
        double valor;

        System.out.println("Informe o código do produto:");
        codigo = sc.nextLong();

        System.out.println("Informe o nome do produto: ");
        nomeProduto = sc.next();

        System.out.println("Informe a data de validade: ");
        dataValidade = sc.next();

        System.out.println("Informe o valor do produto: ");
        valor = sc.nextDouble();

        System.out.println("Os valores digitados são:");
        System.out.println("Codigo do produto = " + codigo);
        System.out.println("Nome do produto = " + nomeProduto);
        System.out.println("Data de validade do produto = " + dataValidade);
        System.out.println("Valor R$ = " + valor);

        sc.close();
    }
}
