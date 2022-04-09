import java.util.Scanner;

public class beecrowd_1072{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um valor inteiro: ");
        int numeroInteiroN = scanner.nextInt();

        int i = 0, j = 0;

        j--;
        while(i < numeroInteiroN) {
            if (i >= 10 && i <= 20) {
                j++;
            }

            i++;
        }

        if(j < 0) {
            System.out.println(i + " out, " + (j+1) + " in");    
        } else {
            System.out.println(i + " out, " + j + " in");
        }
        
        scanner.close();
    }
}