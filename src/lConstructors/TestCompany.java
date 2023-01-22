package lConstructors;

import java.util.ArrayList;

public class TestCompany {
    public static void main(String[] args) {
        Company c1 = new Company("Flipkart");
        System.out.println(c1.name);
        //this will return the default value
        System.out.println(c1.empCount);

        //if ArrayList is not already created, create it before creating the object
        ArrayList <String> wallMartList = new ArrayList<>();
        wallMartList.add("food");
        wallMartList.add("elecronics");
        wallMartList.add("electricals");
        Company c3 = new Company("WallMart", 1000, wallMartList, true, 200);
        System.out.println("c3 enteries_________________");
        System.out.println(c3.name);
        System.out.println(c3.isFunded);
        System.out.println(c3.empCount);
        System.out.println(c3.catList);
        System.out.println(c3.sharePrice);
    }
}
