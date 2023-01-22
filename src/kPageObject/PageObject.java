package kPageObject;

public class PageObject {
    public void m1(){
        System.out.println("m1");
        m2();
    }

    private void m2() {
        System.out.println("m2");
        m3();
    }

    private void m3() {
        System.out.println("m3");
    }

    public static void main(String[] args) {
        PageObject loginPage = new PageObject();
        /**
         * Here object is created of the class PageObject
         * then using the refrence varaible loginPage method m1 of class
         * PageObject is called which is turn call m2() and m2 method is 
         * calling m3()
         */
        loginPage.m1();
    }
    
}
