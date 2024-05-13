package repetitiva.while_.parte_I;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        while (valor >= 0) {
            System.out.println("informa um valor: ");
            valor = sc.nextInt();
            
            if (valor < 0 ) {
                System.out.println("O valor informador é negativo ou 0: " + valor);
            } else {
                System.out.println("O valor informado é positivo: " + valor);
            }
            
        }

        System.out.println("Fim do programa");

        sc.close();
    }
}
