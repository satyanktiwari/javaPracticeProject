package oInheritance;

public class Maruti extends Car{
    /**
     * This is the child class -03
     */

    //Method Overrding: poly+morphism -> dynamic (RunTime)
	//when you have the same method in parent class and in child class
	//with:
        //1. the same name
        //2. same number of parameters
        //3. same type of parameters
        //4. same return type
        
    @Override
    public void start() {
        System.out.println("Maruti is Starting");
    }

    public void parkingAssist(){
        System.out.println("Parking assitance activated");
    }

    //Static methods can't be overridden but they can be hidden
    public static void price(){
        System.out.println("This is the Maruti price");
        
    }
        
}
