import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int[] array = new int[5];

        System.out.println("preencha seu vetor: ");
        for(int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
        }
        
        System.out.print("escolha um numero: ");
        int n = sc.nextInt();

        for(int i = 0; i < array.length; i++){
            if (n == array[i]){
                System.out.print("posição do número no vetor é: " + i);
                break;                
            } else{
                continue;
            }
        }        
    
    }
}
