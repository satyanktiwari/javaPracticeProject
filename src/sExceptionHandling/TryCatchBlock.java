package sExceptionHandling;

public class TryCatchBlock {
    String name;
    public static void main(String[] args) {
        

        System.out.println("This is the first statment in main");
        TryCatchBlock obj = new TryCatchBlock();
        // above statement will be available for garbage collection
        // due to the below statement
        obj = null;

        try {
            //this is null.name so will give Null Pointer exception
            obj.name = "Harry";
        } catch (NullPointerException e) {
            System.out.println("THis will give Null Pointer exception");
            e.printStackTrace();
        }
        
        
      try {
        int i = 9/0;
      } catch (ArithmeticException e) {
        System.out.println("This is Arithmetic Exception");
        }
        
        try {
            int k[] = new int[2];
             k[4] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOB exception\n");
            e.printStackTrace();
        }

        // Exception is the parent class for all exceptions
        // Throwable is the parent of exception class
        // Object class is the parent of all classes but can't be used in exception handling
        
        //Above exception can be handled using the Exception class

        try {
            int i= 9/0;
        } catch (Exception e) {
            System.out.println("Handled using the Exception class"); 
        }

        try {
            int i= 9/0;
        } catch (Throwable e) {
            System.out.println("Handled using the Throwable class\n"); 
            e.printStackTrace();
        }
        
    }
}
