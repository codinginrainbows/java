package IFRS_logica2022;

import java.util.Scanner;

public class lista3_ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe homem(1) ou mulher(2): ");
        int userGender = scanner.nextInt();

        if (userGender == 1) {
            System.out.println("Agora que já sabemos que você é homem informe altura: ");
            double userHeight = scanner.nextDouble();

            double idealWeight = 72.7 * userHeight - 58;
            System.out.printf("Seu peso ideal é:%.2f ", idealWeight + "kg");
        } else if (userGender == 2) {
            System.out.println("Agora que já sabemos que você é mulher informe altura: ");
            double userHeight = scanner.nextDouble();

            double idealWeight = 62.1 * userHeight - 44.7;
            System.out.printf("Seu peso ideal é:%.2f ", idealWeight + "kg");
        }

        scanner.close();
    }
}