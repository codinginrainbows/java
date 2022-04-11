import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter the rectangle's width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter the rectangle's height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("AREA: " + rectangle.area());
        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("DIAGONAL: " + rectangle.diagonal());

        sc.close();
    }
}
