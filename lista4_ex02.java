import java.util.Scanner;

public class lista4_ex2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um valor inteiro: ");
        int numeroInteiroN = scanner.nextInt();
        
        int i = 0, somaDeTodosPares = 0;
        while (i <= numeroInteiroN) {
            if(i % 2 == 0) {
                somaDeTodosPares = somaDeTodosPares + i;
            }
            i++;
        }

        System.out.println("Soma de todos os números de 1 até " + numeroInteiroN + ": " + somaDeTodosPares + "\n");

        scanner.close();
    }
}
