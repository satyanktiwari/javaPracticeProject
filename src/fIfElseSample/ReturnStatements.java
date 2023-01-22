package fIfElseSample;

public class ReturnStatements {
    public int getStudentMarksMethodOne (String studentName){
        if (studentName.equals("John")){
            return 100;
        } else if (studentName.equals("Mary")){
            return 90;
        } else if (studentName.equals("Sam")){
            return 80;
        } else {
            return -1;
        }
    }


public static void main(String[] args) {

    ReturnStatements returnStatements = new ReturnStatements();
    int marks = returnStatements.getStudentMarksMethodOne("Shri");
    System.out.println(marks);
}

}


    
    

