
/*
Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres (supondo que as idades do mesmo sexo serão diferentes). 

O programa deve fazer o SOMATÓRIO da idade do HOMEM MAIS VELHO com a idade da MULHER MAIS NOVA e o PRODUTO da idade do HOMEM MAIS NOVO pela idade da MULHER MAIS VELHA. 

Ao final, você deve imprimir os resultados, e cada uma das idades digitadas: 

mulher mais nova, mulher mais velha, homem mais novo e homem mais velho
*/

import java.util.Scanner;

public class list2_exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstGuyAge, secondGuyAge, firstGirlAge, secondGirlAge, oldestGuy, youngestGuy, oldestGirl, youngestGirl;

        // finding first guy's age
        System.out.print("\n\n\n\n how old are the first gentlemen over there? ");
        firstGuyAge = scanner.nextInt();

        // finding second guy's age
        System.out.print(" what about the the other one? ");
        secondGuyAge = scanner.nextInt();

        // finding first girl's age
        System.out.print("\n and this lady here, how old is she? ");
        firstGirlAge = scanner.nextInt();

        // finding second girl's age
        System.out.print(" how old is the one seated right aside her? ");
        secondGirlAge = scanner.nextInt();

        // finding the oldest guy
        if (firstGuyAge > secondGuyAge) {
            oldestGuy = firstGuyAge;
            youngestGuy = secondGuyAge;
        } else {
            oldestGuy = secondGuyAge;
            youngestGuy = firstGuyAge;
        }

        // finding the oldest girl
        if (firstGirlAge > secondGirlAge) {
            oldestGirl = firstGirlAge;
            youngestGirl = secondGuyAge;
        } else {
            oldestGirl = secondGirlAge;
            youngestGirl = firstGirlAge;
        }

        int olderGuyAgePlusYoungerGirlAge = oldestGuy + youngestGirl;
        int youngerGuyAgeMultipliedByOlderGirlAge = youngestGirl * oldestGuy;

        // showing results
        System.out.print("\n\n\n youngest girl is " + youngestGirl + " years old");
        System.out.print("\n oldest girl is " + oldestGirl + " years old");

        System.out.print("\n\n youngest guy is " + youngestGuy + " years old");
        System.out.print("\n oldest guy is " + oldestGuy + " years old");

        System.out.print("\n\n\n\n older guy's age plus younger girl's age is: " + olderGuyAgePlusYoungerGirlAge);
        System.out.print("\n younger guy's age multiplied by older girl's age is: "
                + youngerGuyAgeMultipliedByOlderGirlAge + "\n\n\n\n");

        scanner.close();
    }
}