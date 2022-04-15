import java.util.Scanner;

public class beecrowd_1165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInteiroN = 0, contador = 1, contadorDeDivisiveis = 0, casosDeTeste = 0, contadorDois = 2;

        System.out.print("\nQuantos casos de teste? ");
        casosDeTeste = scanner.nextInt();

        while (contadorDois <= casosDeTeste) {

            System.out.print("\nNumero a ser testado: ");
            numeroInteiroN = scanner.nextInt();

            while (contador <= numeroInteiroN) {
                if (numeroInteiroN % contador == 0) {
                    contadorDeDivisiveis++;
                }

                contador++;
            }

            if (contadorDeDivisiveis == 2) {
                System.out.println(numeroInteiroN + " eh um numero primo!");
            } else {
                System.out.println(numeroInteiroN + " nao eh um numero primo!");
            }

            contadorDeDivisiveis = 0;
            contador = 1;

            contadorDois++;
        }
    }
}