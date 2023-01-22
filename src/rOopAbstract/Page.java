package rOopAbstract;

public abstract class Page extends WebPage implements W3C {

    //Default constructor
    public Page(){
        System.out.println("Default constructor for Page class");
    }

    //overloaded consturctor with int type parameter
    public Page(int i){
        System.out.println("page constructor with one parameter");
    }

    public abstract void title();
    public abstract void url();
    
    public void doLogin(String userName, String password){
        System.out.println("Page Login ");
    }

    // how to prevent overriding => use static - will have only 1 copy
    public static void logo(){
        System.out.println("Page ...logo");
    }

    // a copy of the method will be given to each class
    
    //this mehtod can be inherted from the parent class
    public final void calculatePrice(){
        System.out.println("Calculate page price......");

    }

    @Override
    public void loading(){
        System.out.println("Page ...........loading");
    }

// this can now be inherited from the page class
    @Override
    public final void javaScriptLoading(){
        System.out.println("page level JS loading");
    }

    
}
