package sequencial.processamento;

public class exercicio07 {
    public static void main(String[] args) {

        // Exercício: Calcular a porcentagem de um valor em relação a outro.

        double valorTotal = 1200.0;
        double valorParcial = 480.0;

        // Calculando a porcentagem
        double porcentagem = (valorParcial / valorTotal) * 100;

        System.out.println("O valor parcial representa " + porcentagem + "% do valor total.");
    }
}
