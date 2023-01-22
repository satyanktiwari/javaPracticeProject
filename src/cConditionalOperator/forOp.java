package cConditionalOperator;

public class forOp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Variation1 
        int i = 1;
        for (; i <= 10; i++) {
            System.out.println(i);
        }

        // Variation2
        int j = 1;
        for (; j <= 10; ) {
            System.out.println(j);
            j++;
        }

        for(double k=1.1; k<10.9;k++){
            System.out.println(k);       

        }

        // Print Odd numbers
        for(int l=1;l<=10;l++){
            if(l%2!=0){
                System.out.println(l);
            }
        }

        
    

        // Print even numbers
        for(int m=1;m<=10;m++){
            if (m % 2 == 0) {
                System.out.println(m);
            }
        }

}
}
