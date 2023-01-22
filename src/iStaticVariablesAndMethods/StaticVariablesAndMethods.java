package iStaticVariablesAndMethods;

class TestStaticMethods {
    //Objects are stored in Heap memory
    //Refrence variables are stored in Stack memory
    //Static variables are stored in Common memmory application
    // Static variables are shared across all objects
    // Saves memory
    /**
    - Static variable examples
    - Static String footer
    - Static Stringlogo
    - Static String baseUrl
    - Static String CompayName
     */

    //  Static methods
    public static void start(){
        System.out.println("Machine Started");
    }

    public static void stop(){
        System.out.println("Machine Stopped");
    }
    
}

public class StaticVariablesAndMethods{
    public static void main(String[] args) {
        TestStaticMethods.start();
        TestStaticMethods.stop();
    }

}
