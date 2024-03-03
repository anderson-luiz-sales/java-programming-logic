package sequencial.saida;

import java.util.Locale;

public class exercicio07 {
    public static void main(String[] args) {

        String nomeCompleto = "Carlos Oliveira";
        int idade = 45;
        String profissao = "engenheiro civil";
        char estadoCivil = 'C';
        char genero = 'M';
        double salarioMensal = 5000.50;
        boolean possuiFilhos = true;

        /*
            Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
            Olá, eu sou Carlos Oliveira, um engenheiro civil de 45 anos. Sou C, meu salário é R$ 5000,50
            e minha condição de filhos é true e meu genero é M.
         */

        System.out.printf("Olá, eu sou %s, um %s de %d anos. ", nomeCompleto, profissao, idade);
        System.out.printf("Sou %c, meu salário é R$ %.2f", estadoCivil, salarioMensal);
        System.out.printf(" e minha condição de filhos é %b", possuiFilhos);
        System.out.printf(" e meu genero é %c.", genero);
        Locale.setDefault(Locale.US);
    }
}
