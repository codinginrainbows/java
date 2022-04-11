import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("how long would you like your array to be? ");
        int n = sc.nextInt();

        int[] arraybasis = new int[n];
        int[] arraysum = new int[n];
        int sum = 0;

        System.out.println("fill array basis: ");
        for(int i = 0; i < n; i++){
            arraybasis[i] = sc.nextInt();
            sum = arraybasis[i] + sum;
            arraysum[i] = sum;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arraysum[i] + " ");
        }

        
        
    }
}
