package IFRS_logica2022;

import java.util.Scanner;

public class lista3_ex11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("quantos lados têm o polígono? ");
        int numeroDeLados = scanner.nextInt();

        // caso o numero de lados não seja adequado o programa não continua
        if (numeroDeLados < 3 || numeroDeLados > 5) {
            System.out.println("NÃO É UM POLÍGONO ou POLÍGONO NÃO IDENTIFICADO");
        } else {
            System.out.print("Quantos centímetros têm cada lado? ");
            int centimetrosEmCadaUmDosLados = scanner.nextInt();

            if (numeroDeLados == 3) {
                int perimetroDoTriangulo = centimetrosEmCadaUmDosLados * numeroDeLados;
                System.out.println("Perímetro do TRIANGULO: " + perimetroDoTriangulo);
            } else if (numeroDeLados == 4) {
                int areaDoQuadrado = centimetrosEmCadaUmDosLados * centimetrosEmCadaUmDosLados;
                System.out.println("Área do QUADRADO: " + areaDoQuadrado);
            } else if (numeroDeLados == 5) {
                System.out.println("PENTAGONO!");

            }
        }

        scanner.close();
    }
}