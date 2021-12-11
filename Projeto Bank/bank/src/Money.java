
public class Money {

    private int accountNumber;
    private String name;
    private double accountMoney;

    public Money(){
    }

    public Money(int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public Money(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAccountMoney(){
        return accountMoney;
    }

    public void deposit(double amount){
        accountMoney += amount;
    }

    public void withdraw(double amount){
        accountMoney -= amount + 5;
    }

    public String toString(){
        return 
          "ACCOUNT: " + accountNumber + " / "
        + "HOLDER: " + name + " / "
        + "BALANCE: $" + String.format("%.2f", accountMoney) + ". ";
    }

}
