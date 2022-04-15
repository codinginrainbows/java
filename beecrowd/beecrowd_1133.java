import java.util.Scanner;

public class beecrowd_1133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumeroInteiroN = 0, segundoNumeroInteiroN = 0, contador = 0;

        System.out.print("digite dois numeros: ");
        primeiroNumeroInteiroN = scanner.nextInt();
        segundoNumeroInteiroN = scanner.nextInt();

        contador = primeiroNumeroInteiroN;

        while (contador >= primeiroNumeroInteiroN && contador < segundoNumeroInteiroN) {
            if (contador % 5 == 2 || contador % 5 == 3) {
                System.out.println(contador);
            }

            contador++;
        }

        scanner.close();
    }
}
