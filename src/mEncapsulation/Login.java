package mEncapsulation;

public class Login{
   private String userName;
    private String password;
    
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    //Business Logic
    public void doLogin(){
        System.out.println("Enter Username "+this.userName);
        System.out.println("Enter Password " + this.password);
        System.out.println("Login is done");       
        
    }

    public void doLogin(String userName, String password){
        System.out.println("Enter Username "+userName);
        System.out.println("Enter Password " + password);
        System.out.println("Login is done");       
    
    }
    

    
}