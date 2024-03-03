package sequencial.exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int VALOR_COMISSAO = 15;

        String nome;
        double salarioFixo;
        double valorVenda;
        double totalSalario;

        System.out.println("Informe o nome do funciário");
        nome = sc.nextLine();

        System.out.println("Informe o salário fixo do funcionário");
        salarioFixo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o total em vendas do funcionário");
        valorVenda = sc.nextDouble();
        sc.nextLine();

        totalSalario = salarioFixo + ((valorVenda * VALOR_COMISSAO) / 100);

        System.out.println("Nome do funcionário = " + nome);
        System.out.printf("TOTAL = R$ %.2f", totalSalario);

        sc.close();
    }
}
