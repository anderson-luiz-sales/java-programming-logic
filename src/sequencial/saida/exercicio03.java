package sequencial.saida;

public class exercicio03 {
    public static void main(String[] args) {

        String animal = "Leão";
        String habitat = "Savana";
        int quantidadeFilhotes = 3;

        /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            O Leão é um animal selvagem que vive na Savana. Normalmente, uma fêmea tem cerca de 3 filhotes.
         */

        System.out.print("O ");
        System.out.printf("%s", animal);
        System.out.printf(" é um animal selvagem que vive na %s. ", habitat);
        System.out.printf("Normalmente, uma fêmea tem cerca de %d filhotes.", quantidadeFilhotes);
    }
}
