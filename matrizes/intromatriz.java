import java.util.Locale;
import java.util.Scanner;

public class intromatriz {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
         
        int matriz[][] = new int[3][3];
        int linha3 = 0;
        int coluna2 = 0;
        int diagonal = 0;
        int negativos = 0;
        int total = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j= 0; j < matriz.length; j++){
                System.out.print("insira um valor para a posição (" + (i+1) + "," + (j+1) + ")");
                matriz[i][j] = sc.nextInt();

                if(i==2){
                    linha3 = linha3 + matriz[i][j];
                }

                if(j==1){
                    coluna2 = coluna2 + matriz[i][j];
                }

                if(i==j){
                    diagonal = diagonal + matriz[i][j];
                }

                if(matriz[i][j] < 0){
                    negativos = negativos + 1;
                }

                total = total + matriz[i][j];
            }
        }

        System.out.println("SOMA LINHA 3: " + linha3);        
        System.out.println("SOMA COLUNA 2: " + coluna2);
        System.out.println("SOMA DIAGONAL: " + diagonal);
        System.out.println("QUANTIDADE DE NEGATIVOS: " + negativos);
        System.out.println("SOMA TOTAL: " + total);
    }
}