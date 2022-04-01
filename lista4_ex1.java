import java.util.Scanner;

public class lista4_ex1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um valor inteiro: ");
        int numeroInteiroN = scanner.nextInt();
        
        int i = 0, somaDeTodos = 0;
        while (i <= numeroInteiroN) {
            somaDeTodos = somaDeTodos + i;
            i++;
        }

        System.out.println("Soma de todos os números de 1 até " + numeroInteiroN + ": " + somaDeTodos + "\n");

        scanner.close();
    }
}