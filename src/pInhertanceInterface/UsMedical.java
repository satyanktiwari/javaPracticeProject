package pInhertanceInterface;

public interface UsMedical extends Medical {
    /**
     * Parent
     */
    static final int min_fee = 10;

    // No Method Body//only method declaration
	// Only Method Prototype
	// only abstract method: no body
	// can not create the Object of Interface
	// can not have static abstract non static method
	// 100% abstraction


    //Create the services
    public void cardiology();

    public void oncology();

    public void rheumatology();

    public void erServices();

    @Override
    public void vaccination();

    //after jdk 1.8:
	//1. can have static method with method body:
    public static void billing(){
        System.out.println("\nUSMedical -- billing");
    }

    //2. can have non static default method:
    default void optionalServices(){
        System.out.println("\nUSMedical -- optional services default method");
    }
}
