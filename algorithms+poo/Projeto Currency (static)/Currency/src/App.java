import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("what's the dollar price? U$$");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("how many dollars will you bought? U$$");
        CurrencyConverter.dollarBought = sc.nextDouble();

        System.out.print("amount to be paid in reais: R$");
        System.out.print(CurrencyConverter.finalPriceTax());

        sc.close();
    }
}
