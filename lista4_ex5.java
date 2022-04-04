import java.util.Scanner;

public class lista4_ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 1;
        float grade, avredgeGrade = 0;

        while(counter <= 5) {
            System.out.print("Enter your grade number " + counter + ": ");
            grade = scanner.nextFloat();
            
            avredgeGrade = avredgeGrade + grade;

            if(counter == 5) {
                avredgeGrade = avredgeGrade / counter;
            }

            counter++;
        }

        System.out.printf("\nYour avredge grade is: %.2f\n", avredgeGrade );
    }
}