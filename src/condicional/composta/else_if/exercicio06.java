package condicional.composta.else_if;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (caractere >= 'A' && caractere <= 'Z') {
            System.out.println("O caractere é uma letra maiúscula.");
        } else if (caractere >= 'a' && caractere <= 'z') {
            System.out.println("O caractere é uma letra minúscula.");
        } else {
            System.out.println("O caractere não é uma letra.");
        }

        scanner.close();
    }
}
