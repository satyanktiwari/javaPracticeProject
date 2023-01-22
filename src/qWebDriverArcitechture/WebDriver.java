package qWebDriverArcitechture;

public interface WebDriver extends SearchContext{

    @Override
    public void findElement();

    @Override
    public void findElelments();

    public void get(String url);

    public String getTitle();

    public String getUrl();

    public void sendKeys(String text);

    public void click();

    public void close();
    


    
    
}