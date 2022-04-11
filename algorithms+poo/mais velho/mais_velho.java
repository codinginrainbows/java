import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("how many people would like to count? ");
        int n = sc.nextInt();

        String[] arrayName = new String[n];
        Double[] arrayAge = new Double[n];

        for (int i = 0; i < n; i++){
            System.out.println("information from person number " + (i+1) + ":");
            System.out.print("Name: ");
            arrayName [i] = sc.next();
            System.out.print("Age: ");
            arrayAge [i] = sc.nextDouble();
        }

        int posish = 0;
        double oldest = 0;
        oldest = arrayAge[0];
        
        for (int i = 0; i < n; i++){    
            if (arrayAge[i] > oldest){
                oldest = arrayAge[i];
                posish = i;
            }
        }

        System.out.print("Oldest person: " + arrayName[posish]);

        sc.close();
    }

}
