package qWebDriverArcitechture;

public class EcommerceTest {
    public static void main(String[] args) {
        String browser = "chrome";

        //Cross browser logic
        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();             
            } else if(browser.equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver();
            } else if(browser.equalsIgnoreCase("safari")){
                driver = new SafariDriver();
            } else{
                System.out.println
                ("Incorrect browser string.\nPlease pass the right browser");
            }
            driver.get("www.amazon.com");
            String title = driver.getTitle();
            System.out.println("Title of the page is: "+ title);

            String url = driver.getUrl();
            System.out.println("url for the page is: "+ url);

            driver.findElelments();
            driver.findElement();

            driver.sendKeys("testusername");
            driver.sendKeys("password");
            driver.click();

            driver.close();
    }

    
}
