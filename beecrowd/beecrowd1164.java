import java.util.Scanner;

public class beecrowd1164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1, numeroPerfeito = 0, somaNumerosPerfeitos = 0;

        System.out.print("Escolha um numero: ");
        int numeroEscolhido = scanner.nextInt();
        
        while (contador < numeroEscolhido) {
            if(numeroEscolhido % contador == 0) {
                numeroPerfeito = contador;
                
                somaNumerosPerfeitos = somaNumerosPerfeitos + numeroPerfeito;
            }

            contador++;
        }

        if(somaNumerosPerfeitos == numeroEscolhido) {
            System.out.println("\n" + numeroEscolhido + " eh um numero perfeito!");
        } else {
            System.out.println("\n" + numeroEscolhido + " NAO eh um numero perfeito!");
        }

    }
}