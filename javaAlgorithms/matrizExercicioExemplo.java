import java.util.Locale;
import java.util.Scanner;

public class matrizExercicioExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

            //PARTE 1 - LEITURA DA MATRIZ!!!

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

            //PARTE 2 - DIAGONAL!!!

        System.out.println("------------------------");
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int i=0; i<matriz.length; i++){
                System.out.print(matriz[i][i] + " ");
        }

            //PARTE 3 - NEGATIVOS!!!

        int cont = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[i][j] < 0){
                    cont += 1;
                }
            }
        }
        
        System.out.println();
        System.out.println("------------------------");
        System.out.println("QUANTIDADE DE NEGATIVOS:");
        System.out.print(cont);

        sc.close();
    }
}