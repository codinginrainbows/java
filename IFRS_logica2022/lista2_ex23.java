package IFRS_logica2022;

import java.util.Scanner;

public class lista2_ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberOfPotatoes, minNumberOfPotatoes, actualNumberOfPotatoes, averageNumberOfPotatoes;

        System.out.println("\n\nwhat's the number of Potatoes you have stocked? \n");

        System.out.print("actual: "); // line break
        actualNumberOfPotatoes = scanner.nextInt();
        System.out.print("\n"); // line break

        System.out.print("minimum: "); // line break
        minNumberOfPotatoes = scanner.nextInt();
        System.out.print("\n"); // line break

        System.out.print("maximum: "); // line break
        maxNumberOfPotatoes = scanner.nextInt();
        System.out.print("\n"); // line break

        averageNumberOfPotatoes = maxNumberOfPotatoes - minNumberOfPotatoes / 2;

        System.out.println("the average number of potatoes is: " + averageNumberOfPotatoes);

        if (actualNumberOfPotatoes >= averageNumberOfPotatoes) {
            System.out.println("\nwe don't need any more! \n\n\n");
        } else {
            System.out.println("\nlet's buy some more! \n\n\n");
        }

        scanner.close();
    }
}
