package qWebDriverArcitechture;

public class RemoteWebdriver implements WebDriver{

    @Override
    public void click() {
        System.out.println("Click completed");
        
    }

    @Override
    public void close() {
        System.out.println("Browser Closed");
        
    }

    @Override
    public void findElelments() {
        System.out.println("Finding elements");
        
    }

    @Override
    public void findElement() {
        System.out.println("Finding element");
        
    }

    @Override
    public void get(String url) {
        System.out.println("URL loading");
        
    }

    @Override
    public String getTitle() {
        return "Some Title";
    }

    @Override
    public String getUrl() {
        return "https://www.google.com";
    }

    @Override
    public void sendKeys(String value) {
        System.out.println("Entered value: "+ value);
        
    }
    
}
