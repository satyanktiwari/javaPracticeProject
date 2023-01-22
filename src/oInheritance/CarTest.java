package oInheritance;

public class CarTest {
    public static void main(String[] args) {
        Maruti maruti800 = new Maruti();
        maruti800.start();//Override
        maruti800.engine();//inherited from grandparent
        Maruti.price();//Static method accessed using class name
        maruti800.stop();//inherited from parent

        //Top casting example
        Car c1 = new Maruti();
        c1.engine();
        c1.start();
        Car.price();
        c1.stop();

        //child class object can be referred by grand parent class reference variable
        Machine m1 = new Maruti();
        m1.engine();


        //down casting:

        //parent class object cannot be referred by child class reference variable
        // Maruti marutiZen = (Maruti)new Car();//java.lang.ClassCastException:
        // marutiZen.start();

        //Grand Parent class object cannot be referred by child class reference variable
        Maruti marutiErtiga = (Maruti)new Machine();
        marutiErtiga.start();//java.lang.ClassCastException


        
    }
}
