package dArrays;

public class ArraySample {
    public static void main(String[] args) {
        // Array name should be plural as it will hold more than 1 value
        int [] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Create array of type Object to hold student data
        Object [] Student = new Object[3];
        Student[0] = "John";
        Student[1] = "12";
        Student[2] = "M";

        Object [] Student1 = new Object[3];
        Student1[0]="David";
        Student1[1] = "14";
        Student1[2] = "M";

        for(Object e:Student){
            System.out.println(e);
        }

        for(Object e:Student1){
            System.out.println(e);
        }

 // Two dimensional array
        int[][] number = new int[3][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;
        number[2][0] = 70;
        number[2][1] = 80;
        number[2][2] = 90;

        System.out.println("Two dimensional array example");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);
            }
        }

    }

  


    
}
