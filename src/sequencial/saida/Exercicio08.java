package sequencial.saida;

import java.util.Locale;

public class Exercicio08 {
    public static void main(String[] args) {

        String nome = "Lucas Santos";
        int idade = 35;
        String profissao = "engenheiro elétrico";
        char estadoCivil = 'C';
        char genero = 'M';
        double salarioMensal = 5500.90;
        boolean possuiFilhos = true;
        String cidadeAtual = "São Paulo";
        int anosExperiencia = 10;

        /*
            Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
            Olá, meu nome é Lucas Santos, um engenheiro elétrico de 35 anos. Sou C, moro em São Paulo,
            meu salário é R$ 5500,90, tenho 10 anos de experiência, sou do gênero M e meu status de filhos é true.
         */

        System.out.printf("Olá, meu nome é %s, um %s de %d anos. ", nome, profissao, idade);
        System.out.printf("Sou %s, moro em %s, meu salário é R$ %.2f", estadoCivil, cidadeAtual, salarioMensal);
        System.out.printf(", tenho %d anos de experiência, sou do gênero %c", anosExperiencia, genero);
        System.out.printf(" e meu status de filhos é %b.", possuiFilhos);
        Locale.setDefault(Locale.US);
    }
}
