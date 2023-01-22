package cConditionalOperator;

public class IfOp {
    public static void main(String[] args) {
        // Set the varaible of type bollean to true initially
        boolean value = true;
        if (value) {
            System.out.println("Value is true");
            // Reset the value of boolean variable to false so 
            // that the subsequent statement can be printed
            value = false;
        }if (!value) {
            System.out.println("Value is now false");
        }
    }
}
