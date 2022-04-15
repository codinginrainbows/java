import java.util.Scanner;

public class beecrowd_1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInteiroN = 0, contador = 1, paresDeNumeroInteiroN = 0, quadradoDosPares = 0;

        System.out.print("Digite um numero: ");
        numeroInteiroN = scanner.nextInt();

        while (contador <= numeroInteiroN) {
            if (contador % 2 == 0) {
                paresDeNumeroInteiroN = contador;

                quadradoDosPares = paresDeNumeroInteiroN * paresDeNumeroInteiroN;

                System.out.println(contador + " * " + contador + " = " + quadradoDosPares);
            }

            contador++;
        }
    }
}