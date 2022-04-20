import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int segundos = 0;
        double gramasMinimas = 0.10;

        System.out.print("massa inicial em gramas: ");
        double massaInicial = scanner.nextDouble();

        System.out.print("porcentagem de perda por segundo: ");
        double porcentagemDePerda = scanner.nextInt();

        double perdaDeMassa = porcentagemDePerda / 100;

        while (massaInicial >= gramasMinimas) {
            massaInicial -= perdaDeMassa;

            segundos++;
        }

        // if (segundos >= 60 && segundos < 3600) {
        // int segundosEmMinutos = segundos / 60;

        // System.out.println(segundosEmMinutos + " minuto(s)");
        // } else if (segundos >= 3600 && segundos < 86400) {
        // int segundosEmHoras = segundos / 3600;

        // System.out.println(segundosEmHoras + " hora(s)");
        // } else if (segundos >= 86400) {
        // int segundosEmDias = segundos / 86400;

        // System.out.println(segundosEmDias + " dia(s)");
        // } else {
        // System.out.println(segundos);
        // }

        System.out.println(segundos);
    }
}