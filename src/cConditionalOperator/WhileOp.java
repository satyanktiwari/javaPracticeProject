package cConditionalOperator;

public class WhileOp{
    public static void main(String[] args) {
        System.out.println("test");

       //write a while loop to print 1 to 1o values
       int i=1;
       while(i<=10){
            System.out.println(i);
            i++;
       }

    //    DO WHILE loop
       int j=1;
       do{
           System.out.println("This value of J will always be printed: "+j);
           j++;
           } while (j <= 10);

        //    While with IF condition to break the loop

        int k=1;
        while(k<10){
            System.out.println(k);
            k++;
            if(k==5){
                break;
            }

        }
        
    }
}