package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4: ");
        int animal = scanner.nextInt();

        switch (animal) {
            case 1:
                System.out.println("Cachorro");
                break;
            case 2:
                System.out.println("Gato");
                break;
            case 3:
                System.out.println("Pássaro");
                break;
            case 4:
                System.out.println("Peixe");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
