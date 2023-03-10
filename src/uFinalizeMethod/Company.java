package uFinalizeMethod;

public class Company {
    String compName;


    /**
     * Add override tag and finalize method here so that it is called when 
     * object is created in the employee class
     */
    @Override
    public void finalize(){
        System.out.println("Finalize inside company.....");
    }
}
