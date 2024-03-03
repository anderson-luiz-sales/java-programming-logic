package sequencial.exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = 3.14159;

        double raio;
        double area;


        System.out.println("Digite o valor do raio");
        raio = sc.nextDouble();

        area = N * (raio * raio);

        System.out.printf("A = " + area);

        sc.close();
    }
}
