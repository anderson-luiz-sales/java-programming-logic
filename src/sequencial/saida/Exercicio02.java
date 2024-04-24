package sequencial.saida;

public class Exercicio02 {

    public static void main(String[] args) {

        String profissao = "Engenheiro";
        String cidade = "São Paulo";
        int numeroFavorito = 7;

         /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            Eu sou um Engenheiro que mora em São Paulo e meu número favorito é 7.
         */

        System.out.print("Eu sou um ");
        System.out.printf("%s", profissao);
        System.out.printf(" que mora em %s ", cidade);
        System.out.printf("e meu número favorito é %d.", numeroFavorito);

    }
}
