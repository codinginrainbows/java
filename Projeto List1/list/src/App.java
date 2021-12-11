import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);        
    
    List<Employee> list = new ArrayList<>();

    // PART 1 - READING DATA

    System.out.print("how many employees will be registered? ");
    int n = sc.nextInt();

    for (int i=0; i<n; i++){
        System.out.println("EMPLOYEE #" + (i+1) + ": ");
        
        System.out.print("ID: ");
        int id = sc.nextInt();
        
        while (hasId(list, id)){
            System.out.println("ID already taken. Try Again!");
            System.out.print("ID: ");
            id = sc.nextInt();
        }

        System.out.print("NAME: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("SALARY: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, salary));
        System.out.println("------------------");
    }

    // PART 2 - INCREASING SALARY

    System.out.print("Enter the employee ID that will have his salary increased: ");
    int id = sc.nextInt();
    Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This ID does not exist. Please, try again!");
        } else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.salaryIncrease(percentage);
        }
    
    // PART 3 - LISTING EMPLOYEES
    
    System.out.println("--------------------");
    System.out.println("LIST OF EMPLOYEES: ");
    for (Employee obj : list){
        System.out.println(obj);
    }

    sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
    }
}
