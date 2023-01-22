package mEncapsulation;

public class Browser {

    //private methods are called by public method
    //details of private method are not exposed
    //ENCPASULATION
    public void launchBrowser(){
        System.out.println("Launching browser");
        whichOs();
        clearCache();
        System.out.println("Browser launched");
    }

    private String whichOs(){
        return  "Os is Windows ver10";
    }

    private void clearCache(){
        System.out.println("Clearing cache");  

    }


    
}
