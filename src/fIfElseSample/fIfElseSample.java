package fIfElseSample;

public class fIfElseSample {
    //alternative way to code ReturnStatements
    public int getStudentMarks(String studentName){
        int marks = -1;
        if(studentName.equals("Sameer")){
            marks = 90;
        } 
        else if(studentName.equals("Ram")){
            marks = 85;
        }
        else if(studentName.equals("Sita")){
            marks = 80;
        }
        else{
            System.out.println("please pass the correct student name");
        }
        return marks;
    }

    public static void main(String[] args) {
        fIfElseSample st = new fIfElseSample();
        int m = st.getStudentMarks("Ram");
        System.out.println(m+5-3);

        m= st.getStudentMarks("sri");
        if(m==-1){
            System.out.println("Don't print marksheets");
        } else{
            System.out.println(m);
        }

    }
}