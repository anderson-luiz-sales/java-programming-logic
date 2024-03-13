package condicional.simples.condicionalOu;

public class Exercicio05 {
    public static void main(String[] args) {
        int ano = 2024;

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 || ano > 2000) {
            System.out.println("Ano válido");
        }

        if (!((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 || ano > 2000)) {
            System.out.println("Ano inválido");
        }
    }
}
