package condicional.composta.else_if;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Verificando a faixa de classificação do IMC
        System.out.print("Seu IMC é " + imc + ", o que indica: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        scanner.close();
    }
}
