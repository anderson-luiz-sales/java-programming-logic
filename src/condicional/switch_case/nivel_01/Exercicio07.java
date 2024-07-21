package condicional.switch_case.nivel_01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Dó");
                break;
            case 2:
                System.out.println("Ré");
                break;
            case 3:
                System.out.println("Mi");
                break;
            case 4:
                System.out.println("Fá");
                break;
            case 5:
                System.out.println("Sol");
                break;
            case 6:
                System.out.println("Lá");
                break;
            case 7:
                System.out.println("Si");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}
