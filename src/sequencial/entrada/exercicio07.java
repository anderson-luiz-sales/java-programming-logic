package sequencial.entrada;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /*
            Usando os valores das variáveis, produza a seguinte entrada e saída na tela do console:
        */
        Scanner sc = new Scanner(System.in);
        String nomeCliente;
        String cpfCliente;
        int idadeCliente;
        String emailCliente;

        System.out.println("Informe o nome do cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Informe o CPF do cliente:");
        cpfCliente = sc.next();

        System.out.println("Informe a idade do cliente:");
        idadeCliente = sc.nextInt();

        System.out.println("Informe o e-mail do cliente:");
        emailCliente = sc.next();

        System.out.println("\nInformações do cliente registradas com sucesso:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("CPF: " + cpfCliente);
        System.out.println("Idade: " + idadeCliente);
        System.out.println("E-mail: " + emailCliente);

        sc.close();
    }
}
