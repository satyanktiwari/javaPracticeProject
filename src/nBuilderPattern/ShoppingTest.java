package nBuilderPattern;

public class ShoppingTest {
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
