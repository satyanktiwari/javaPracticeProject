package eArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice  {
    public static void main(String[] args) {
        ArrayList <String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Maça");
        fruitList.add("Uva");
        fruitList.add("Morango");
        fruitList.add("Laranja");
        
        // Will sort the list in alpha order
        // Collections.sort(fruitList);

        // Will reverse the order
        Collections.sort(fruitList, Collections.reverseOrder());

        for(String fruit: fruitList){
            System.out.println(fruit);
        }

        // Create 

        
    
    
    }
}
