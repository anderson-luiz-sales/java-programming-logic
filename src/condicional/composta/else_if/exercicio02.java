package condicional.composta.else_if;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o comprimento do segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        // Verificando o tipo de triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        scanner.close();
    }
}
