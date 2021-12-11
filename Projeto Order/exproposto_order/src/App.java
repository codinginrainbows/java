import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(); //line breaking
        System.out.println("ENTER CLIENT DATA");
        System.out.println(); //line breaking
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);
        
        System.out.println(); //line breaking
        System.out.println("ENTER ORDER DATA");
        System.out.println(); //line breaking
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
            
        Order order = new Order(new Date(), status, client);

        System.out.println(); //line breaking

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        System.out.println(); //line breaking
        
        System.out.println("------------------------"); //line breaking
        for (int i = 0; i < n; i++){
            System.out.println("ENTER ITEM #" + (i+1) + " DATA");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: $");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
            
            System.out.println("------------------------"); //line breaking
        }

        System.out.println(); //line breaking

        System.out.println("ORDER SUMMARY");
        System.out.println(); //line breaking
        System.out.println(order);
        System.out.println(); //line breaking

        sc.close();
    }
}
