import java.util.Locale;
import java.util.Scanner;

public class abaixo_media{
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;
        double mvet, soma;
        
        System.out.print("quantos elementos tera seu vetor? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for(i = 0; i < n; i++){
            System.out.print("digite um numero: ");
            vet[i] = sc.nextDouble();
        }

            soma = 0;
        for (i=0; i<n; i++) {
	        soma = soma + vet[i];
	    }

        mvet = soma / n;
        System.out.print("MEDIA = " + mvet);

        for(i = 0; i<n; i++){
            if (vet[i] < mvet){
	        	System.out.println(vet[i]);
            } else{}
        }
        
        sc.close();

    }

}