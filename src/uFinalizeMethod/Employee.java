package uFinalizeMethod;

/**
 * if reference is null and garbage collector is called 
 * only then the finalize method is called 
 * all other scenarios it is not called.
 */
public class Employee {
    String name;

    public static void main(String[] args) {
        // Employee e = new Employee();
        // e=null;
        Company c = new Company();
        c=null;
        
        System.gc();

        System.out.println("This is emp class...");
    }
    /**
     * 1. Class which is overriding the finalize method can only call it 
     * 2. In this case since the method is overridden within the same class it will work
     * 3. if in the main class if System.gc() is commented below method is not called
     * 
     * 4. Also if the emp object is commented and only the company object is available
     * Then the finalize method from the Company class is called (See #1)
     */
    @Override
    public void finalize(){
        System.out.println("Inside finalize...");
    }
}
