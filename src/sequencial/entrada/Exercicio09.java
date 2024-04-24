package sequencial.entrada;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);
        String marcaVeiculo;
        String modeloVeiculo;
        int anoVeiculo;
        double precoVeiculo;

        System.out.println("Informe a marca do veículo:");
        marcaVeiculo = sc.nextLine();

        System.out.println("Informe o modelo do veículo:");
        modeloVeiculo = sc.nextLine();

        System.out.println("Informe o ano do veículo:");
        anoVeiculo = sc.nextInt();

        System.out.println("Informe o preço do veículo:");
        precoVeiculo = sc.nextDouble();

        System.out.println("\nInformações do veículo registradas com sucesso:");
        System.out.println("Marca: " + marcaVeiculo);
        System.out.println("Modelo: " + modeloVeiculo);
        System.out.println("Ano: " + anoVeiculo);
        System.out.println("Preço: " + precoVeiculo);

        sc.close();
    }
}
