package sequencial.processamento;

public class Exercicio10 {
    public static void main(String[] args) {

        // Exercício: Calcular o novo salário após um aumento percentual.

        double salarioAtual = 2500.0;
        double percentualAumento = 15.0;

        // Calculando o valor do aumento
        double aumento = (percentualAumento / 100) * salarioAtual;

        // Calculando o novo salário
        double novoSalario = salarioAtual + aumento;

        System.out.println("Se aplicarmos um aumento de " + percentualAumento + "%, o novo salário será de R$ " + novoSalario);
    }
}
