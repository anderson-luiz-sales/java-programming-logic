package sequencial.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        int qtdHora;
        double valor;
        double salario;

        System.out.println("Informe o código do funcionário");
        codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe a quantidade de horas trabalhadas");
        qtdHora = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o valor da hora trabalhada");
        valor = sc.nextDouble();

        salario = (double) qtdHora * valor;

        System.out.println("NUMBER = " + codigo);
        System.out.println("SALARY = " + salario);


        sc.close();
    }
}
