import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    Hotel[] array = new Hotel[10];

    System.out.print("How many rooms will be rented? ");
    int n = sc.nextInt();

    for(int i = 0; i<n; i++){
        sc.nextLine();
        System.out.println("RENT #" + (i+1));
        System.out.print("NAME: ");
        String name = sc.nextLine();
        System.out.print("E-MAIL: ");
        String email = sc.nextLine();
        System.out.print("ROOM: ");
        int room = sc.nextInt();
        array[room] = new Hotel(name, email);
        System.out.println();
    }

    System.out.println();
    System.out.println("BUSY ROOMS: ");
    for(int i = 0; i<10; i++){
        if(array[i] != null){
            System.out.println(i + ": " + array[i]);
        } else{

        }
    }

    sc.close();
    }
}
