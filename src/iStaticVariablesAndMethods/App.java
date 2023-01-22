package iStaticVariablesAndMethods;

public class App {
    /**
     * This is another class
     * This can access the static methods in the TestStatic class
     * Format to access is:
     * className.StaticMethodName
     * @param args
     */
    
    public static void main(String[] args) {
        TestStaticMethods.stop();
        TestStaticMethods.start();
    }
}
