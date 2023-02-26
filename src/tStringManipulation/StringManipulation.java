package tStringManipulation;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 6));
            /**
             * Returns a string that is a substring of this string. 
             * The substring begins with the character at the specified index and 
             * extends to the end of this string.
             */
        System.out.println(str.substring(6));
        System.out.println(str.substring(6, 11));

        System.out.println(str.replace("World", "Universe"));
        String spaceBetweeString = "Hello  World";
        System.out.println("Replacing space between strings - "+spaceBetweeString.replace(" ", ""));
        

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        /**
         * trim() -removes leading and trailing space
         * useful when reading values from excel or properties file before comparision
         */
        System.out.println(str.trim());
        String top ="     hello      world      ";
        //This will not trim space between words
        System.out.println("Using trim function to replace white space - "+top.trim());

        System.out.println(str.concat(" ").concat("World"));

        System.out.println(str.contains("World"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        
        //If String is not found at index then -1 is returned
        if(str.indexOf("test")!=-1){
            System.out.println("test is there");
        }else{            
            System.out.println("test is not there");
        }

        //Exception - StringIndexOutOfBoundsException
        
        try {      
            System.out.println(str.charAt(12));      
            } catch (Exception e) {
            System.out.println("Exception occured and stack trace is printed below\n");
            e.printStackTrace();
        }
        // String comparision
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        System.out.println("Comparing 2 strings using dot equals");
        System.out.println(str1.equals(str2));
        System.out.println(str3.equalsIgnoreCase(str2));
    }

    

    
    
}
