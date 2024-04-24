package sequencial.entrada;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        String cargoFuncionario;
        double salarioFuncionario;
        int idadeFuncionario;

        System.out.println("Informe o nome do funcionário:");
        nomeFuncionario = sc.nextLine();

        System.out.println("Informe o cargo do funcionário:");
        cargoFuncionario = sc.next();

        System.out.println("Informe o salário do funcionário:");
        salarioFuncionario = sc.nextDouble();

        System.out.println("Informe a idade do funcionário:");
        idadeFuncionario = sc.nextInt();

        System.out.println("\nInformações do funcionário registradas com sucesso:");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Cargo: " + cargoFuncionario);
        System.out.println("Salário: " + salarioFuncionario);
        System.out.println("Idade: " + idadeFuncionario);

        sc.close();

    }
}
