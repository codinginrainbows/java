import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);

    Grades grades = new Grades();

    System.out.print("FIRST GRADE: ");
    grades.grade1 = sc.nextDouble();
    System.out.print("SECOND GRADE: ");
    grades.grade2 = sc.nextDouble();
    System.out.print("THIRD GRADE: ");
    grades.grade3 = sc.nextDouble();
    System.out.println();

    System.out.println("MISSING POINTS" + grades.finalGrade());
    
    if (grades.finalGrade() < 60){
        System.out.println("FAILED!");
        System.out.print("MISSING: " + grades.MissingPoints());
    } else {
        System.out.println("PASSED!");
    }

    sc.close();
    }
}
