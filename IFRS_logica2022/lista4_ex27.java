import java.util.Scanner;

public class lista4_ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1, valorN = 0, valorInicial = 0, dobroValorInicial = 0, somaComAntecessor = 0;

        System.out.print("Quantos calculos deseja operar: ");
        valorN = scanner.nextInt();

        System.out.print("Digite um valor: ");
        valorInicial = scanner.nextInt();

        while (contador <= valorN) {
            if (somaComAntecessor < 100000 || dobroValorInicial < 100000) {
                dobroValorInicial = valorInicial * 2;
                somaComAntecessor = valorInicial + dobroValorInicial;
                valorInicial = dobroValorInicial;

                System.out.print("\nDobro: " + dobroValorInicial + " Soma com antecessor: " + somaComAntecessor);

                contador++;
            }
        }
    }
}