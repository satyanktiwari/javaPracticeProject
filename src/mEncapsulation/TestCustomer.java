package mEncapsulation;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer("John Doe", 21, "IA"); //POST
        
        System.out.println(c1.getName());//GET
        System.out.println(c1.getAge());
        System.out.println(c1.getCity());

        c1.setCity("Mumbai"); // Update the City (PUT/PATCH)
        System.out.println(c1.getCity());
        
        
    }
    
}
