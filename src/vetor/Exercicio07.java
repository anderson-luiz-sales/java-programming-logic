package vetor;

public class Exercicio07 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};

        System.out.println("Notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ": " + notas[i]);
        }
    }
}
