package sequencial.saida;

import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {

        String cidade = "Paris";
        String atividade = "chef de cozinha";
        char nivelEducativo = 'M';
        char genero = 'M';
        double salario = 3000.75;

        /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            Eu moro em Paris e trabalho como chef de cozinha. Como profissional de nível educativo M,
            meu salário é R$ 3000,75 e meu gênero é masculino.
         */

        System.out.printf("Eu moro em %s", cidade);
        System.out.printf(" e trabalho como %s. Como profissional de nível educativo %c,", atividade, nivelEducativo);
        System.out.printf(" meu salário é R$ %.2f e meu gênero é %c.", salario, genero);
        Locale.setDefault(Locale.US);
    }
}
