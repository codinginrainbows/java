import java.util.Scanner;

public class provaSecreta_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double bonusA = 0;
        double bonusB = 0;
        double teoriaA, teoriaB, praticaA, praticaB;
        double pontuacaoA, pontuacaoTotalA, pontuacaoB, pontuacaoTotalB;

        System.out.print("\nQuantas partidas deseja jogar? ");
        int partidas = scanner.nextInt();

        while (contador <= partidas) {
            System.out.print("\nInsira TEORIA do professor A: ");
            teoriaA = scanner.nextInt();
            System.out.print("Insira PRATICA do professor A: ");
            praticaA = scanner.nextInt();
            pontuacaoA = (teoriaA + praticaA) / 2;

            bonusA = Math.round(Math.random() * (6 - 1) + 1);
            pontuacaoTotalA = pontuacaoA + bonusA;

            System.out.print("\nInsira a TEORIA do professor B: ");
            teoriaB = scanner.nextInt();
            System.out.print("Insira a PRATICA do professor B: ");
            praticaB = scanner.nextInt();

            pontuacaoB = (teoriaB + praticaB) / 2;
            bonusB = Math.round(Math.random() * (6 - 1) + 1);
            pontuacaoTotalB = pontuacaoB + bonusB;

            System.out.printf("\n#" + contador + " Carta A: %.0f" + " e " + "%.0f", teoriaA, praticaA);

            System.out.printf("\n#" + contador + " Carta B: %.0f" + " e " + "%.0f", teoriaB, praticaB);

            System.out.printf("\n\n#" + contador + " Carta A: " + pontuacaoA + " + %.0f", bonusA);

            System.out.printf("\n#" + contador + " Carta B: " + pontuacaoB + " + %.0f", bonusB);

            if (pontuacaoTotalA > pontuacaoTotalB) {
                System.out.print("\n\n[A] VENCEU\n\n");
            } else if (pontuacaoTotalA < pontuacaoTotalB) {
                System.out.print("\n\n[B] VENCEU!\n\n");
            } else {
                System.out.print("\n\n[A] e [B] EMPATARAM!\n\n");
            }

            contador++;
        }
    }
}
