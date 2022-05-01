import java.util.Scanner;

/*
user deve determinar tamanho do vetor

dentro de um laço o user escolhe
uma posicao e um valor para colocar no vetor

vetor eh mostrado na tela a cada iteraçao do laço

se o usuario digitar posicao -1 o programa encerra

posicoes invalidas devem apresentar uma msg de erro

o vetor ser do tipo float
*/

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        final int tamanho = scanner.nextInt();

        float[] array = new float[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.print("digite uma posicao para alterar o valor: ");
            int position = scanner.nextInt();
            if (position == -1) break;

            if (position >= 0 && position < tamanho) {
                System.out.print("digite um valor para a posicao " + position + ": ");
                array[position] = scanner.nextFloat();
            } else {
                System.out.println("erro!!! posicao invalida");
            }

            System.out.println("posicao " + position + " - " + array[position]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("---------------\nposicao " + i + " - " + array[i]);
        }
    }
}
