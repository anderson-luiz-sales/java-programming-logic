package sequencial.saida;

public class exercicio01 {
    public static void main(String[] args) {

        String nome = "Anderson";
        String sobreNome = "Sales";
        int idade = 28;

         /*
            Usando os valores das variáveis, produza a seguinte saída na tela do console:
            Meu nome é Anderson e o meu sobrenome é Sales e a minha idade é 28 anos.
         */

        System.out.print("Meu nome é ");
        System.out.printf("%s", nome);
        System.out.printf("e o meu sobrenome é %s ", sobreNome);
        System.out.printf("e a minha idade é %d.", idade);
    }
}