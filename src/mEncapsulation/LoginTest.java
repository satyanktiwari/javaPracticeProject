package mEncapsulation;

public class LoginTest {
    public static void main(String[] args) {
        Login u1 = new Login("john", "john123");
        System.out.println(u1.getUserName());
        System.out.println(u1.getPassword());
        u1.doLogin();

        Login u2 = new Login("john doe", "john123");
        String username = u2.getUserName();
        String password = u2.getPassword();
        u2.doLogin(username, password);

        Browser br = new Browser();
        br.launchBrowser();
        Login u3 = new Login("testJohnDoe", "password");
        u3.doLogin();
        
        
       

    }
}
