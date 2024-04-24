package sequencial.entrada;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);
        double notaAluno1;
        double notaAluno2;

        System.out.println("Informe a nota do primeiro aluno:");
        notaAluno1 = sc.nextDouble();

        System.out.println("Informe a nota do segundo aluno:");
        notaAluno2 = sc.nextDouble();

        System.out.println();

        System.out.println("Notas dos alunos registradas com sucesso!");
        System.out.println("Nota 1 = " + notaAluno1);
        System.out.println("Nota 2 = " + notaAluno2);

        sc.close();
    }
}
