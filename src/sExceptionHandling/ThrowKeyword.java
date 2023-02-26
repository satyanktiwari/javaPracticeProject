package sExceptionHandling;

public class ThrowKeyword {
    public static void getData(){
        String data = null;
        if(data==null){
            try {
                throw new Exception("data is null");
            } catch (Exception e) {
                System.out.println("Exception occured and stack trace is printed below\n");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getData();
    }
    
}
