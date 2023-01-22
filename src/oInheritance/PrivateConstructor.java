package oInheritance;

//object of following class can't be created
public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("This will prevent object creation");
    }
}
