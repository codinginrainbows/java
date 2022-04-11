import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("ENTER PRODUCT DATA");
        System.out.print("NAME:");
        product.name = sc.nextLine();
        System.out.print("PRICE:");
        product.price = sc.nextDouble();
        System.out.print("QUANTITY IN STOCK: ");
        product.quantity = sc.nextInt();

        System.out.println("PRODUCT DATA: " + product);

        System.out.print("How many products would you like to add in your stock? ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println("Updated data: " + product);
        
        System.out.print("How many products would you like to remove from your stock? ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
    
    sc.close();
    }
}