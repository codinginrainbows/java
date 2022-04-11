import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] arrayTBF = new int[]{5, 7, 2};
        int[] arrayTry = new int[3];

        System.out.println("tente acertar uma sequência de 3 numeros: ");
        
        for(int i = 0; i < 3; i++){
            arrayTry[i] = sc.nextInt();
            if(arrayTry[i] == arrayTBF[i]){
                System.out.println("acertou o " + (i+1) + "o numero!");
            }else{
                System.out.println("não foi dessa vez :(");
                break;
            }
            if(arrayTry[0] == arrayTBF[0] && arrayTry[1] == arrayTBF[1] && arrayTry[2] == arrayTBF[2]){
                System.out.println("yaaaaay! vc foi perfeito :)");
            }
        }
    }
}