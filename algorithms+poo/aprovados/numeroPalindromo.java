import java.util.Scanner;

public class numeroPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um valor de 4 digitos: ");
        int numeroInteiro = scanner.nextInt();

        int primeiroAlgarismo = numeroInteiro / 1000;
        int sobraPrimeiroAlgarismo = numeroInteiro % 1000;

        int segundoAlgarismo = sobraPrimeiroAlgarismo / 100;

        int terceiroAlgarismo = (sobraPrimeiroAlgarismo % 100) / 10;

        int quartoAlgarismo = (sobraPrimeiroAlgarismo % 10);

        System.out.print(quartoAlgarismo + "" + terceiroAlgarismo + "" + segundoAlgarismo + "" + primeiroAlgarismo);
    }
}