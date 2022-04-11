import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("how many students would like to count? ");
        int n = sc.nextInt();

        double[] arrayGradeOne = new double[n];
        double[] arrayGradeTwo = new double[n];
        String[] arrayName = new String[n];
        double[] arraySum = new double[n];
        double[] arrayAvredge = new double[n];
        
        System.out.print("how many grades does your school has: ");
        int grades = sc.nextInt();
        System.out.print("grade needed to move on to the next year: ");
        int gradeNeed = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            System.out.println("provide name, first and second grade of student number " + (i+1) + ": ");
            arrayName[i] = sc.next();
            arrayGradeOne[i] = sc.nextDouble();
            arrayGradeTwo[i] = sc.nextDouble();
            arraySum[i] = arrayGradeOne[i] + arrayGradeTwo[i];
            arrayAvredge[i] = arraySum[i] / 2;
            if(arrayAvredge[i] < gradeNeed){
                System.out.print("FLUNKED!");        
            }
            else{
                System.out.print("MOVED ON!");
            } 
            System.out.print("\n");
        }

        sc.close();
        
        // System.out.print(Arrays.toString(arrayAvredge));

    }

}