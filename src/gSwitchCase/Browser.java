package gSwitchCase;

public class Browser {
    //launch a browser
    // input param
    // return boolean

    // Using the Swtich statements
    public boolean openBrowser(String browserName) {
        System.out.println("Browser name passed is:" + browserName);
        switch (browserName) {
            case "chrome":
                System.out.println("Chrome launched");
                return true;
            case "firefox":
                System.out.println("Firefox launched");
                return true;
            case "edge":
                System.out.println("Edge launched");
                return true;
            default:
                System.out.println("Browser not supported");
                return false;
        }
    }

    public static void main(String[] args) {
        Browser br = new Browser();
        br.openBrowser("ie");
    }

       

}
