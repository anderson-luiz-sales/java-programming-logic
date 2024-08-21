package vetor.saida;

public class Exercicio10 {
    public static void main(String[] args) {
        String[] produtos = {"Laptop", "Smartphone", "Tablet", "Fones de ouvido"};
        double[] precos = {2999.99, 1499.50, 799.90, 199.99};

        System.out.println("Produtos e preços:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Produto: %s - Preço: R$ %.2f%n", produtos[i], precos[i]);
        }
    }
}
