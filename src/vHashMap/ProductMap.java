package vHashMap;

import java.util.HashMap;

public class ProductMap {
    public static void main(String[] args) {
        // Create a product map using HashMap
        // HashMap has (Key,value) pair
        // (k,v) can also be represent as this

        HashMap<String, String> productMap = new HashMap<String, String>();
        productMap.put("name", "iPhone");
        productMap.put("type", "phone");

        System.out.println(productMap.get("type"));

        // Using a lambda function to print all k,v
        // lambda expression - fetch key and value and supply output to sysout
        productMap.forEach((k,v)->System.out.println(k+": "+v));


        // Student id with name HashMap
        HashMap<Integer,String> studentMap = new HashMap<Integer,String>();
        studentMap.put(1, "Sunil");
        studentMap.put(2, "Sai");
        studentMap.put(3, "Siva");
        studentMap.put(4, "Srinivas");

        System.out.println("\nStudentMap with key: "+studentMap.get(2));

        // Use lambda expression to print all key,value
        System.out.println("\nStudentMap: Printing all key,value using lambda expression");
        studentMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
