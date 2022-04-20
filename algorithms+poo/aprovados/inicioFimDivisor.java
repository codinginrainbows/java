import java.util.Scanner;

public class provaSecreta_ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("\nDelimite o inicio e o fim do intervalo: ");
        int inicioIntervalo = scanner.nextInt();
        int finalIntervalo = scanner.nextInt();

        System.out.println("\nDigite o valor divisor: ");
        int divisor = scanner.nextInt();

        while (inicioIntervalo < finalIntervalo) {
            inicioIntervalo++;

            if (inicioIntervalo % divisor == 0) {
                soma += inicioIntervalo;
            }
        }

        System.out.print("\nResultado: " + soma);
    }
}
