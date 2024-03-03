package sequencial.exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SEGUNDOS_POR_HORA = 3600;
        int SEGUNDOS_POR_MINUTO = 60;

        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / SEGUNDOS_POR_HORA;
        int minutos = (totalSegundos % SEGUNDOS_POR_HORA) / SEGUNDOS_POR_MINUTO;
        int segundos = totalSegundos % SEGUNDOS_POR_MINUTO;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        scanner.close();
    }
}
