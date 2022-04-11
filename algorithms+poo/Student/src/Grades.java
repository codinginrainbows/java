
public class Grades {

public double grade1;
public double grade2;
public double grade3;

public double finalGrade(){
    return grade1 + grade2 + grade3;
}

public double MissingPoints(){
    if(finalGrade() < 60){
        return 60 - finalGrade();
    } else{
        return 0.0;
    }
}

}
