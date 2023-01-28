package nBuilderPattern;

public class ShoppingTest {
    /**
     * Builder pattern helps in method chaining.
     * With this different workflow can be achieved.
     * and different workflows can be defined for testing easily.
     * Not used in Page object model
     * @param args
     */
    public static void main(String[] args) {
        EcomApp ecomUser1 = new EcomApp();
    
    //method chaining
    ecomUser1.login("user1", "password1")
        .searchProduct("iphone")
        .clickProduct("iphone")
        .doPayment("ABVP12345", 123, 6789)
        .generateOrder()
        .sendOrderViaEmail()
        .logout();
    }
    
}
