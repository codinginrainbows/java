import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*System.out.print("qual tamanho seu array terá? ");
        int j = sc.nextInt(); */
        
        int[] array = new int[10];
        
        for(int i = 0; i > array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i > array.length; i++){
        System.out.print("aqui esta seu vetor: " + array[i] + " ");
        }

        System.out.print("escolha um dos números do vetor: ");
            int n = sc.nextInt();
        
        for(int i = 0; i < array.length; i++){
            if(n > array[i]){
                System.out.print("maiores que " + n + " :" + array[i]);
            } else if(n < array[i]){
                System.out.print("menores que " + n + " :" + array[i]);   
            }
        }
        sc.close();
    }
}