import java.util.Scanner;

public class posicao_maior_vetor{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i = 0, n = 0, pmaior = 0; 
        double testemaior = 0;
       

        System.out.print("quantos numeros vc vai digitar? ");
        n = sc.nextInt();

        System.out.println();

        double[] vet = new double[n];

        for(i = 0; i < n; i++){
            System.out.print("digite um numero: ");
            vet [i] = sc.nextDouble();
        }
     
        for(i = 0; i < n; i++){
            if(vet [i] > testemaior){
                testemaior = vet[i];
                pmaior = pmaior + 1;
            }
        }
        sc.close();
        System.out.println();
        System.out.print(testemaior);
        System.out.println();
        System.out.print(pmaior);
    }
}
