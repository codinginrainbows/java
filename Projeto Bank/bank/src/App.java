import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Money money;

    System.out.print("enter account number: ");
    int accountNumber = sc.nextInt();
    System.out.print("enter account holder: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("is there an inicial deposit (y/n)? ");
    char response = sc.next().charAt(0);
    if (response == 'y'){
        System.out.print("enter the inicial deposit: $");
        double inicialDeposit = sc.nextDouble();
        money = new Money(accountNumber, name, inicialDeposit);
    } else{
        money = new Money(accountNumber, name);
    }

    System.out.println(money);
    System.out.println();

    System.out.print("enter a deposit value: $");
    double depositValue = sc.nextDouble();
    money.deposit(depositValue);

    System.out.println(money);
    System.out.println();

    System.out.print("enter a withdraw value: $");
    double withdrawValue = sc.nextDouble(); 
    money.withdraw(withdrawValue);

    System.out.println(money);
    System.out.println();

    sc.close();
    }
}
