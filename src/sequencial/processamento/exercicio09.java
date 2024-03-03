package sequencial.processamento;

public class exercicio09 {
    public static void main(String[] args) {

        // Exercício: Calcular o preço final após aplicar um desconto percentual.

        double precoOriginal = 120.0;
        double percentualDesconto = 10.0;

        // Calculando o valor do desconto
        double desconto = (percentualDesconto / 100) * precoOriginal;

        // Calculando o preço final com desconto
        double precoFinal = precoOriginal - desconto;

        System.out.println("Se aplicarmos um desconto de " + percentualDesconto + "%, o preço final será de R$ " + precoFinal);
    }
}
