/* 
Mariazinha quer resolver um problema interessante. Dadas as informações de população e a taxa de crescimento de duas cidades quaisquer (A e B), ela gostaria de saber quantos anos levará para que a cidade menor (sempre é a cidade A) ultrapasse a cidade B em população. Claro que ela quer saber apenas para as cidades cuja taxa de crescimento da cidade A é maior do que a taxa de crescimento da cidade B, portanto, previamente já separou para você apenas os casos de teste que tem a taxa de crescimento maior para a cidade A. Sua tarefa é construir um programa que apresente o tempo em anos para cada caso de teste.

Porém, em alguns casos o tempo pode ser muito grande, e Mariazinha não se interessa em saber exatamente o tempo para estes casos. Basta que você informe, nesta situação, a mensagem "Mais de 1 seculo.".

Entrada
A primeira linha da entrada contém um único inteiro T, indicando o número de casos de teste (1 ≤ T ≤ 3000). Cada caso de teste contém 4 números: dois inteiros PA e PB (100 ≤ PA < 1000000, PA < PB ≤ 1000000) indicando respectivamente a população de A e B, e dois valores G1 e G2 (0.1 ≤ G1 ≤ 10.0, 0.0 ≤ G2 ≤ 10.0, G2 < G1) com um digito após o ponto decimal cada, indicando respectivamente o crescimento populacional de A e B (em percentual).

Atenção: A população é sempre um valor inteiro, portanto, um crescimento de 2.5 % sobre uma população de 100 pessoas resultará em 102 pessoas, e não 102.5 pessoas, enquanto um crescimento de 2.5% sobre uma população de 1000 pessoas resultará em 1025 pessoas. Além disso, não utilize variáveis de precisão simples para as taxas de crescimento.
*/

import java.util.Scanner;

public class beecrowd_1160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anos = 0;
        int populacaoCidadeA = 0, populacaoCidadeB = 0, porcentagemDeCrescimentoA = 0, porcentagemDeCrescimentoB = 0;
        double crescimentoCidadeA = 0, crescimentoCidadeB = 0;

        System.out.print("Informe a populacao da cidade A: ");
        populacaoCidadeA = scanner.nextInt();
        System.out.print("Informe o crescimento anual da cidade A: ");
        crescimentoCidadeA = scanner.nextDouble();
        System.out.print("Informe a populacao da cidade B: ");
        populacaoCidadeB = scanner.nextInt();
        System.out.print("Informe o crescimento anual da cidade B: ");
        crescimentoCidadeB = scanner.nextDouble();

        while (populacaoCidadeA <= populacaoCidadeB) {
            porcentagemDeCrescimentoA = (int) (crescimentoCidadeA * populacaoCidadeA) / 100;
            porcentagemDeCrescimentoB = (int) (crescimentoCidadeB * populacaoCidadeB) / 100;

            populacaoCidadeA = populacaoCidadeA + porcentagemDeCrescimentoA;
            populacaoCidadeB = populacaoCidadeB + porcentagemDeCrescimentoB;

            anos++;
        }

        if (anos < 100) {
            System.out.println(anos + " anos");
        } else {
            System.out.println("Mais de 1 seculo");
        }

    }
}
