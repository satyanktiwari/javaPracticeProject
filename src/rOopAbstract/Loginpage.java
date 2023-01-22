package rOopAbstract;

public class Loginpage extends Page {

    public Loginpage(){
        System.out.println("LoginPage Constructor");
    }

    public Loginpage(int i){
        System.out.println("Loginpage constructor with one parameter");
    }


    @Override
    public void title() {
        System.out.println("Loginpage Title");
        
    }

    @Override
    public void url() {
        System.out.println("Loginpage URL");
        
    }

    public void forgotPassword(){
        System.out.println("Loginpage forgot password");
    }

    @Override
    public void loading(){
        System.out.println("Loginpage loading....");
    }
    
}
