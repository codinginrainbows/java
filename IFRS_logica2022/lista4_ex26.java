import java.util.Scanner;

public class lista4_ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto = 0, candidatoA = 0, candidatoB = 0, candidatoC = 0, numeroDeEleitores = 0, votoNulo = 0;

        System.out.println("\nVote: NULO[0] - CandidatoA[1] - CandidatoB[2] - CandidatoC[3]? ");

        while (voto != -1) {
            voto = scanner.nextInt();

            if (voto == 0 || voto > 3) {
                votoNulo++;
            }

            if (voto == 1) {
                candidatoA++;
            }

            if (voto == 2) {
                candidatoB++;
            }

            if (voto == 3) {
                candidatoC++;
            }
        }

        // desempate
        if (candidatoA == candidatoB || candidatoA == candidatoC ||
            candidatoB == candidatoA || candidatoB == candidatoC ||
            candidatoC == candidatoA || candidatoC == candidatoB
           ) {
            System.out.print("\nCompute o voto desempate: ");

            voto = scanner.nextInt();

            if (voto == 0 || voto > 3) {
                votoNulo++;
            }

            if (voto == 1) {
                candidatoA++;
            }

            if (voto == 2) {
                candidatoB++;
            }

            if (voto == 3) {
                candidatoC++;
            }
        }

        numeroDeEleitores = candidatoA + candidatoB + candidatoC + votoNulo;

        if (candidatoA > candidatoB && candidatoA > candidatoC) {
            System.out.println("\nCandidato VENCEDOR: A");
        } else if (candidatoB > candidatoA && candidatoB > candidatoC) {
            System.out.println("\nCandidato VENCEDOR: B");
        } else if (candidatoC > candidatoA && candidatoC > candidatoB) {
            System.out.println("\nCandidato VENCEDOR: C");
        }

        System.out.println("Votos NULOS: " + votoNulo);
        System.out.println("Total ELEITORES: " + numeroDeEleitores);

    }
}
