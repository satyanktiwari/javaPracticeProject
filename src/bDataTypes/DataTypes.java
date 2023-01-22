package bDataTypes;

public class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.0f;
        double c = 10.0;
        char d = 'a';
        boolean e = true;
        System.out.println("Value of type of integer: "+a);
        System.out.println("Value of type of float: "+ b);
        System.out.println("Value of type of double: "+c);
        System.out.println("Value of type of char: "+d);
        System.out.println("Value of type of boolean: "+e);

        // print characters integer value
        System.out.println((int)d);
        
        //print ascii values 
        for(char ascii='a';ascii<='z';ascii++){
            System.out.println("ascii value is now: "+ ascii);
        }

    }
}
