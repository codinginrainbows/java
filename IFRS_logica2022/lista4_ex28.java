package IFRS_logica2022;

import java.util.Scanner;

public class lista4_ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cedula1real = 0, cedula5reais = 0, cedula10reais = 0;

        System.out.print("Quanto deseja sacar? R$");
        int saque = scanner.nextInt();

        while (saque != 0) {
            cedula10reais = saque / 10;
            saque = saque % 10;

            cedula5reais = saque / 5;
            saque = saque % 5;

            cedula1real = saque / 1;
            saque = saque % 1;

            System.out.println(cedula10reais + " nota(s) de R$10.\n" + 
                               cedula5reais + " nota(s) de R$5.\n" + 
                               cedula1real + " nota(s) de R$1."
                               );
        }

        scanner.close();
    }
}
