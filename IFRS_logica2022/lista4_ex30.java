import java.util.Scanner;

public class lista4_ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerador = 1, denominador = 1, contador = 1;
        int contadorFatorial = 1, fatorialDenominador = 1;
        double soma = 0;

        System.out.print("Ate qual numerador deseja calcular? ");
        int quantidadeDeTermos = scanner.nextInt();

        while (contador <= quantidadeDeTermos) {

            while (contadorFatorial <= denominador) {
                fatorialDenominador = fatorialDenominador * contadorFatorial;

                contadorFatorial++;
            }

            if (numerador != quantidadeDeTermos) {
                System.out.println(numerador + "/" + denominador + "!");
                System.out.println(" +");
            } else {
                System.out.println(numerador + "/" + denominador + "! ");
            }

            soma += (double) numerador / fatorialDenominador;

            fatorialDenominador = 1;
            contadorFatorial = 1;

            numerador++;
            denominador += 2;

            contador++;
        }

        System.out.printf("\nSoma: %.8f", soma);
    }
}