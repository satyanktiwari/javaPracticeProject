package lConstructors;

public class Users {
    String name;
    boolean isPrime;
    int userId;
    String city;

    public Users(String name) {
        this.name = name;
    }

    public Users(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public Users(String name, boolean isPrime, int userId, String city) {
        this.name = name;
        this.isPrime = isPrime;
        this.userId = userId;
        this.city = city;
    }
    
    
    public static void main(String[] args) {
        Users u1 = new Users("John", 21);
        System.out.println(u1.name);
        System.out.println(u1.isPrime);
        System.out.println(u1.userId);
        System.out.println(u1.city);
    }

}
