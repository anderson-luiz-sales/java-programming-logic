package sequencial.exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaTotal;
        double combustivelTotal;
        double consumoMedio;

        System.out.println("Digite a distancia total percorrida");
        distanciaTotal = sc.nextInt();

        System.out.println("Digite o combutivel gasto");
        combustivelTotal = sc.nextDouble();

        consumoMedio = (double) distanciaTotal / combustivelTotal;

        System.out.printf("A média que o automovel faz é: %.3f", consumoMedio);

        sc.close();
    }
}
