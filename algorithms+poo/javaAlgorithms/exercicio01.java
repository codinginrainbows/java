import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args){
   
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos números terá seu vetor? ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("preencha seu vetor: ");

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        
        for (int i = n-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        
        sc.close();

        }
}
