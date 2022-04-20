import java.util.Scanner;

public class provaSecreta_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saque = 0, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;

        System.out.print("QUANTO DESEJA SACAR? R$");
        saque = scanner.nextInt();

        while (saque != 0) {
            if (saque >= 100 && saque % 100 != 1 && saque % 100 != 3) {
                nota100++;
                saque = saque - 100;
            }

            if (saque >= 50 && saque % 50 != 1 && saque % 50 != 3) {
                nota50++;
                saque = saque - 50;
            }

            if (saque >= 20 && saque % 20 != 1 && saque % 20 != 3) {
                nota20++;
                saque = saque - 20;
            }

            if (saque >= 10 && saque % 10 != 1 && saque % 10 != 3) {
                nota10++;
                saque = saque - 10;
            }

            if (saque >= 5 && (saque - 5) % 2 != 1) {
                nota5++;
                saque = saque - 5;
            }

            if (saque >= 2 && saque % 2 != 1) {
                nota2++;
                saque = saque - 2;
            }

        }

        System.out.print(nota100 + " NOTA(S) DE R$100\n");
        System.out.print(nota50 + " NOTA(S) DE R$50\n");
        System.out.print(nota20 + " NOTA(S) DE R$20\n");
        System.out.print(nota10 + " NOTA(S) DE R$10\n");
        System.out.print(nota5 + " NOTA(S) DE R$5\n");
        System.out.print(nota2 + " NOTA(S) DE R$2\n");

        scanner.close();
    }
}