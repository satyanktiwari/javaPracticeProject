package rOopAbstract;

public class LoginPageTest {
    public static void main(String[] args) {
        Loginpage lp = new Loginpage();
        lp.title();
        lp.url();
        lp.doLogin("userName", "password");
        
        lp.loading();
        
      // individual method of the child class  
        lp.forgotPassword();
        
        // Child class has inherited this method from parent
        lp.calculatePrice();

        // this is the static method of the parent class
        //Accessed using the class name
        Page.logo();

        lp.javaScriptLoading();

        //Top casting - parent abstract class refrence variable 
        //is pointing to the child class object

        Page p = new Loginpage();
        //p will be able to access overridden methods and page class methods
        // p will not be able to access individual methods. e.g. forgotPassword() is not accessible
	    //Because refrence type check will be failed
        
    };
}
