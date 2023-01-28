package oInheritance;

public class Car extends Machine{
    /**
     * This is the parent class -02
     */
    
    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    
    }

    //Static method
    public static void price(){
        System.out.println("This is the car price");
    }



   
}
