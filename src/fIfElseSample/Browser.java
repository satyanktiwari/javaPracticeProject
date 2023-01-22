package fIfElseSample;

public class Browser {
    //launch a browser
    // input param
    // return boolean

    //using the if statement
    public boolean launchBrowser(String browserName) {
        System.out.println("Browser name passed is:"+ browserName);
        if(browserName.equals("chrome")){
            System.out.println("Chrome launched");
            return true;
        } else if(browserName.equals("firefox")){
            System.out.println("Firefox launched");
            return true;
        } else if(browserName.equals("edge")){
            System.out.println("Edge launched");
            return true;
        } else{
            System.out.println("Browser not supported");
            return false;
        }
    }

    public static void main(String[] args) {
        Browser br = new Browser();
        br.launchBrowser("ie");
    }

       

}
