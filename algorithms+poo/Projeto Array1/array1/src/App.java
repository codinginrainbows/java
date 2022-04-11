import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("how many products would you like to register? ");
        int n = sc.nextInt();
        Product[] array = new Product[n];

        for (int i = 0; i<array.length; i++){
            sc.nextLine();
            System.out.print("PRODUCT NAME: ");
            String name = sc.nextLine();
            System.out.print("PRODUCT PRICE: $");
            double price = sc.nextDouble();
            array[i] = new Product(name, price);
            System.out.println(); //line breaking
        }

        double sum = 0;

        for (int i = 0; i<array.length; i++){
            sum += array[i].getPrice();
        }

        double avg = sum / n;

        System.out.println(); //line breaking
        System.out.printf("AVERAGE PRICE: $ %.2f%n", avg);

        sc.close();
    }
}