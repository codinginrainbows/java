import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vet =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("preencha seu vetor: ");

        for(int i = 0; i <= 19; i++){
            vet[i] = sc.nextInt();
        }
        for(int i = 0; i <= 9; i++){
            int troca = vet[i]; 
            vet[i] = vet[i+9];
            vet[i+9] = troca;
        }      
        for(int i = 0; i <= 19; i++){
            System.out.print(vet[i] + " ");
        }
        
        sc.close();
    }
}
