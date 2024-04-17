package condicional.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reserva de salas de cinema!");
        System.out.println("Por favor, insira a categoria da sala (Padrão, 3D ou VIP):");
        String categoriaSala = scanner.nextLine();

        System.out.println("Insira o horário da sessão (no formato HH:MM):");
        String horarioSessao = scanner.nextLine();

        System.out.println("A sessão é uma matinê? (Sim / Não):");
        String matine = scanner.nextLine();

        double precoIngresso;
        double desconto = 0;

        switch (categoriaSala.toLowerCase()) {
            case "padrão":
                precoIngresso = 20.00;
                break;
            case "3d":
                precoIngresso = 30.00;
                break;
            case "vip":
                precoIngresso = 50.00;
                break;
            default:
                System.out.println("Categoria de sala inválida!");
                return;
        }

        // Verifica se é matinê e aplica desconto
        if (matine.equals("sim")) {
            desconto += 0.20;
        }

        // Verifica se é terça-feira e aplica desconto adicional
        if (horarioSessao.equals("terça")) {
            desconto += 0.10;
        }

        double precoTotal = precoIngresso - (precoIngresso * desconto);

        System.out.println("O preço total da reserva é: R$" + precoTotal);

        scanner.close();
    }
}
