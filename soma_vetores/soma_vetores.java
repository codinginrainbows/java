import java.util.Locale;
import java.util.Scanner;

public class soma_vetores{

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n; 
        double soma = 0;
        
        System.out.print("how many values would you like in each of your arrays? ");
        n = sc.nextInt();

        double[] arrayA = new double[n];
        double[] arrayB = new double[n];
        
        System.out.println("enter the values of array A: ");
            for (int i = 0; i<n; i++){
                arrayA[i] = sc.nextDouble();
            }
        System.out.println("enter the values of array B: ");
            for (int i = 0; i<n; i++){
                arrayB[i] = sc.nextDouble();
            }
            
        double[] arrayResult = new double[n];
        
        System.out.println("result: ");
        for (int i = 0; i<n; i++){
            soma = arrayA[i] + arrayB[i];
            System.out.println(soma);
        }
    }

}
