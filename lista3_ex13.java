import java.util.Scanner;

public class lista3_exercicio13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhich product would you like? ");
        String productTitle = scanner.next();

        System.out.print("\nHow much of " + productTitle + " would you like to buy? ");
        int productAmount = scanner.nextInt();

        System.out.print("\nHow much are you willing to pay for each of the " + productAmount + " " + productTitle + "s? ");
        int productPrice = scanner.nextInt();

        int totalPrice = productAmount * productPrice;
        System.out.print("\nTotal: " + totalPrice);
        
        if (productAmount <= 5) {
            double totalPriceWithDiscount = 0.98 * totalPrice;
            System.out.printf("\n%d with 2%% of discount: %.0f\n", totalPrice,  totalPriceWithDiscount);
        } else if (productAmount > 5 && productAmount < 10) {
            double totalPriceWithDiscount = 0.97 * totalPrice;
            System.out.printf("\n%d with 3%% of discount: %.0f\n", totalPrice, totalPriceWithDiscount);
        } else {
            double totalPriceWithDiscount = 0.95 * totalPrice;
            System.out.printf("\n%d with 5%% of discount: %.0f\n", totalPrice, totalPriceWithDiscount);
        }

        scanner.close();
    }
}