package gSwitchCase;

import java.util.ArrayList;

public class Company {
    public ArrayList<String> getProductList(String companyName){
        ArrayList<String> prodlist = new ArrayList<>();

        switch(companyName.toLowerCase()){

            case "amazon":
                prodlist.add("watches");
                prodlist.add("perfume");
                break;
            case "flipkart":
                prodlist.add("bags");
                prodlist.add("books");
                break;
            default:
                System.out.println("Name not found. Please check and re-enter");
                break; 
        }
        return prodlist;
    }

    public static void main(String[] args) {
        Company comp = new Company();
        ArrayList<String> prodList = comp.getProductList("amazon");
        System.out.println(prodList);
    }
    
}
