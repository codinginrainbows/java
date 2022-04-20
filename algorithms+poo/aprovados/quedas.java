import java.util.Scanner;

public class provaSecreta_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0, quedas = 0, valorHolder = 0;

        System.out.print("\nQuantidade de valores: ");
        int quantidadeValores = scanner.nextInt();

        System.out.println("\nInforme os valores: ");

        while (contador < quantidadeValores) {
            int valores = scanner.nextInt();

            if (valores < valorHolder) {
                quedas++;
            }

            valorHolder = valores;
            contador++;
        }

        System.out.println("\n" + quedas + " queda(s)\n");
    }
}
