package sequencial.saida;

import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {

        String nome = "Dona Neves";
        String profissao = "aposentada";
        char estadoCivil = 'D';
        char genero = 'F';
        double salario = 1375.65;

        /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            O meu nome é Dona Neves e eu não trabalho, pois sou aposentada. Eu ganho como aposentada R$ 1375,65 e meu estado civil D e meu genero é F.
         */

        System.out.printf("O meu nome é %s", nome);
        System.out.printf(" e eu não trabalho, pois sou %s.", profissao);
        System.out.printf(" Eu ganho como %s R$ %.2f", profissao, salario);
        System.out.printf(" e meu estado civil %c e meu genero é %c.", estadoCivil, genero);
        Locale.setDefault(Locale.US);
    }
}
