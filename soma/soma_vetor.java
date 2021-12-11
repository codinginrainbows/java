import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("quantos numeros vc vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		double soma = 0;
		double media = 0;
		
		for (i = 0; i < n; i++) {
			System.out.print("digite um numero: ");
			vet[i] = sc.nextInt();
			soma = soma + vet[i];
			media = soma / n;
		}
		
		System.out.print("VALORES: ");
		
		for (i = 0; i < n; i++) {
			System.out.print(vet[i] + ", ");
		}
		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MEDIA " + media);
		
	}

}
