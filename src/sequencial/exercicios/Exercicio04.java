package sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int VALOR_LITROS = 12;

        int tempo;
        int velocidadeMedia;
        double qtdLitros;

        System.out.println("Informe o tempo gasto da viagem");
        tempo = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe a velocidade média do veiculo");
        velocidadeMedia = sc.nextInt();
        sc.nextLine();

        qtdLitros = (double) (tempo * velocidadeMedia) / VALOR_LITROS;

        System.out.printf("A quantidade de listros é = %.3f", qtdLitros);

        sc.close();
    }
}
