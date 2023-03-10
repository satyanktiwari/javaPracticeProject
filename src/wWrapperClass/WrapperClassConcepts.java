package wWrapperClass;

public class WrapperClassConcepts {
    public static void main(String[] args) {
        
        //Result will be 10020
        String x = "100";        
        
        System.out.println(x+20);

        //Use wrapper class for conversion String to Integer
        int i = Integer.parseInt(x);
        System.out.println(i + 20);

        // Use wrapper class for conversion Alphaneumeric to Integer
        // print statement will give NumberFormatException
        String y = "100A";
        try {
            int j = Integer.parseInt(y);
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("NumberFormatException: please check your conversion");
        }
        
        // Use wrapper class for conversion String to Double
        String z = "100.20";
        double d = Double.parseDouble(z);
        System.out.println(d + 20);

        // Use wrapper class for conversion String to Boolean
                // Example in excel we update execution column to Y or N
        String k = "true";
        boolean flag = Boolean.parseBoolean(k);
        System.out.println(flag);
        if (flag){
            System.out.println("Flag is true running the code");//This will be printed
        }


        //Use wrapper class for conversion integer to String 
        int l = 200;
        String balance = String.valueOf(l);//"200"
        System.out.println(balance + 20);//"20020"

        //substring
        String message = "Your order id is 12345";
        String orderId = message.substring(message.indexOf("is ") + 3);// 12345
        System.out.println(orderId);

        String m1 = message.substring(0, 11);
        System.out.println(m1);
        
    }
}
