import java.util.Scanner;

public class beecrowd1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1, quadrado = 0, cubo = 0;

        System.out.print("Escolha um numero: ");
        int numeroN = scanner.nextInt();
        
        while (contador <= numeroN) {
            quadrado = contador * contador;
            cubo = contador * contador * contador;

            System.out.println(contador + " " + quadrado + " " + cubo);

            quadrado++;
            cubo++;

            System.out.println(contador + " " + quadrado + " " + cubo);

            contador++;
        }
    }
}