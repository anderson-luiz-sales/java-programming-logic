package sequencial.entrada;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.println("Digite o nome");
        nome = sc.nextLine();

        System.out.println("Digite a idade");
        idade = sc.nextInt();

        System.out.println("Digite a altura");
        altura = sc.nextDouble();

        System.out.println();

        System.out.println("Dados digitados");
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("altura = " + altura);

        sc.close();
    }
}
