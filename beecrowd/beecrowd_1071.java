package beecrowd;

import java.util.Scanner;

public class beecrowd_1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor inteiro: ");
        int primeiroNumeroInteiro = scanner.nextInt();
        int primeiroNumeroInteiroAntesDaAlteracao = primeiroNumeroInteiro;

        System.out.print("\nDigite o segundo valor inteiro: ");
        int segundoNumeroInteiro = scanner.nextInt();

        int somaDeTodosImpares = 0;

        while (primeiroNumeroInteiro <= segundoNumeroInteiro) {
            if (primeiroNumeroInteiro % 2 != 0) {
                somaDeTodosImpares = somaDeTodosImpares + primeiroNumeroInteiro;
            }

            primeiroNumeroInteiro++;
        }

        primeiroNumeroInteiro = primeiroNumeroInteiroAntesDaAlteracao;

        System.out.println("\nSoma de todos os números ímpares de " + primeiroNumeroInteiroAntesDaAlteracao + " até "
                + segundoNumeroInteiro + ": " + somaDeTodosImpares + "\n");

        scanner.close();
    }
}