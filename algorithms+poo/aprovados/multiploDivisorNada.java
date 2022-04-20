import java.util.Scanner;

public class provaSecreta_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorInicial = 0, outroValor = 0;

        System.out.print("\nInforme o VALOR INICIAL: ");
        valorInicial = scanner.nextInt();

        while (valorInicial != 0) {
            System.out.print("Informe OUTRO VALOR: ");
            outroValor = scanner.nextInt();

            if (outroValor % valorInicial == 0) {
                System.out.println("\n" + outroValor + " eh multiplo de " + valorInicial + "\n");

                valorInicial = outroValor;
            } else if (valorInicial % outroValor == 0) {
                System.out.println("\n" + outroValor + " eh divisor de " + valorInicial + "\n");

                valorInicial = outroValor;
            } else {
                System.out.println("\n" + outroValor + " nao eh nada de " + valorInicial + "\n");

                valorInicial = outroValor;
            }
        }
    }
}