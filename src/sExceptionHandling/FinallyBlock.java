package sExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        String firstStatment = "First Statment";
        System.out.println(firstStatment);
        try {
            int i =9/0;
            //this will throw an exception
        } catch (ArithmeticException e) {
            
            e.printStackTrace();
        }
        finally {
            /**
             * Can’t be used without try/catch
             * finally is always executed irrespective whether an exception is thrown.
             */
            System.out.println("Finally Block. This is always executed");
        }

    }
}
