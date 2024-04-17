package condicional.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reserva de salas de cinema!");
        System.out.println("Por favor, insira a categoria da sala (Padr�o, 3D ou VIP):");
        String categoriaSala = scanner.nextLine();

        System.out.println("Insira o hor�rio da sess�o (no formato HH:MM):");
        String horarioSessao = scanner.nextLine();

        System.out.println("A sess�o � uma matin�? (Sim / N�o):");
        String matine = scanner.nextLine();

        double precoIngresso;
        double desconto = 0;

        switch (categoriaSala.toLowerCase()) {
            case "padr�o":
                precoIngresso = 20.00;
                break;
            case "3d":
                precoIngresso = 30.00;
                break;
            case "vip":
                precoIngresso = 50.00;
                break;
            default:
                System.out.println("Categoria de sala inv�lida!");
                return;
        }

        // Verifica se � matin� e aplica desconto
        if (matine.equals("sim")) {
            desconto += 0.20;
        }

        // Verifica se � ter�a-feira e aplica desconto adicional
        if (horarioSessao.equals("ter�a")) {
            desconto += 0.10;
        }

        double precoTotal = precoIngresso - (precoIngresso * desconto);

        System.out.println("O pre�o total da reserva �: R$" + precoTotal);

        scanner.close();
    }
}
