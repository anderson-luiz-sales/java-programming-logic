package sequencial.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeroNumero;
        int segundoNumero;
        int prod;

        System.out.println("Informe o primero número");
        primeroNumero = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o segundo número");
        segundoNumero = sc.nextInt();

        prod = primeroNumero * segundoNumero;

        System.out.println("PROD = " + prod);

        sc.close();

    }
}
