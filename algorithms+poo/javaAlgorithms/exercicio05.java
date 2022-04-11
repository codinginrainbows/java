import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vet =  new int[20];

        System.out.println("preencha seu vetor: ");

        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }

        int j = 10;

        for(int i = 0; i < vet.length / 2; i++){
            int troca = vet[j]; 
            vet[j] = vet[i];
            vet[i] = troca;
            j++;
        }      
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
        }
        
        sc.close();
    }
}
