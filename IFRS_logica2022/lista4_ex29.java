import java.util.Scanner;

public class lista4_ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 100, primeiroAlgarismo = 1, segundoAlgarismo = 0, terceiroAlgarismo = 0, produtoAlgarismos = 0;

        System.out.println();
        while (numero < 999) {
            numero++;

            terceiroAlgarismo++;

            if (terceiroAlgarismo == 10) {
                segundoAlgarismo++;
                terceiroAlgarismo = 0;
            }

            if (segundoAlgarismo == 10) {
                primeiroAlgarismo++;
                segundoAlgarismo = 0;
            }

            if (segundoAlgarismo == 2 && terceiroAlgarismo == 0
                    || segundoAlgarismo == 4 && terceiroAlgarismo == 0
                    || segundoAlgarismo == 6 && terceiroAlgarismo == 0
                    || segundoAlgarismo == 8 && terceiroAlgarismo == 0
                    || segundoAlgarismo == 0 && terceiroAlgarismo == 0
               ) {
                System.out.print("\n---> aperte qualquer tecla para continuar: ");
                scanner.next();
                System.out.println();
            }

            if (numero == 101) {
                System.out.println("100 - 1*0*0 = 0");
            }

            produtoAlgarismos = primeiroAlgarismo * segundoAlgarismo * terceiroAlgarismo;

            System.out.print(numero + " - " + primeiroAlgarismo + "*" + segundoAlgarismo + "*" + terceiroAlgarismo + " = " + produtoAlgarismos + "\n");
        }
    }
}
