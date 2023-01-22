package jMainMethodOverloading;

public class MainMethodOverloading{
    
    public static void main(String args[]) {
        System.out.println("Inside the main method");
        main(10);
        main(10,20);
        
    }
        

    public static void main(int a){
        System.out.println("Main overlaod with 1 param: "+ a);
        
    }

    public static void main (int a, int b){
        System.out.println(("Main overlaod with 2 params: "+ a +" and "+ b));
    }


    
}
