package nBuilderPattern;

public class EcomApp {

    private int orderId;

    /**
     * Builder pattern
     * @return current class object -> new EcommApp()
     */
    
    //login
    public EcomApp login(){
        System.out.println("Login Successful");
        return this;
    }


    //login with username and password

    public EcomApp login(String username, String password) {
        System.out.println("Username: "+username +" Password:  "+password 
                                + " \nLogin Successful");
        return this;
    }


    //Search product
    public EcomApp searchProduct(String productName){
        System.out.println("Searching for " + productName);
        return this;
    }

    //search with product and price
    public EcomApp searchProduct(String productName, int price){
        System.out.println("Searching for " + productName + " with price " + price);
        return this;
    }

    //click on product
    public EcomApp clickProduct(String productName){
        System.out.println("Clicking on " + productName);
        return this;
    }

    //add to cart
    public EcomApp addToCart(String productName){
        System.out.println("Adding " + productName + " to cart");
        return this;
    }

    //doPayment cc
    public EcomApp doPayment(String cc, int cvv, int otp){
        System.out.println("Payment with credit card: "+ cc+ "\t"+cvv+"\t"+otp);
        return this;
    }

    //doPayment UPI
    public EcomApp doPayment(String upi){
        System.out.println("Payment with UPI: " + upi);
        return this;
    }
    

    //generateOrder - includes orderid 
    public EcomApp generateOrder(){
        System.out.println("Order Id: " + 12345);
        //hardcoded
        this.orderId = 12345;
        return this;
    }

    //getOrderId
    public int getOrderId(){
        return orderId;
    }
        

    //sendOrderViaEmail
    public EcomApp sendOrderViaEmail(){
        System.out.println("Order sent via email");
        return this;
    }
    //logout
    public EcomApp logout(){
        System.out.println("Logout Successful");
        return this;
    }
    
}
