

public class CurrencyConverter {

    public static final double iof = 0.06; 
    public static double dollarPrice;
    public static double dollarBought;

    public static double finalPrice(){
        return dollarBought * dollarPrice;
    }
    
    public static double finalPriceTax(){
        return (iof * finalPrice()) + finalPrice();
    }
}
