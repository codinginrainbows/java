import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);

        Employee employee = new Employee(); 

        System.out.print("NAME: ");
        employee.name = sc.nextLine();
        System.out.print("SALARY: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("TAX: ");
        employee.tax = sc.nextDouble();

        System.out.println("EMPLOYEE: " + employee);

        System.out.print("how many percent would you like to increase employee's salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("UPDATED DATA:" + employee);

    sc.close();
    }
}
