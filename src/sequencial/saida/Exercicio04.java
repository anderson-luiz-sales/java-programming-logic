package sequencial.saida;

import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {

        String nome = "Pedro";
        String profissao = "Programador";
        double salario = 3500.95;

        /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            O meu nome é Pedro e minha profissão é de  Programador. o meu salarário é de R$ 3500,95.
         */

        System.out.print("O meu nome é ");
        System.out.printf("%s", nome);
        System.out.printf(" e minha profissão é de  %s. ", profissao);
        System.out.printf("o meu salarário é de R$ %.2f.", salario);
        Locale.setDefault(Locale.US);
    }
}
