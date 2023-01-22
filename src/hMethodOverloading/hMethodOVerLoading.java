package hMethodOverloading;

public class hMethodOVerLoading {
    // Method overloading
        //Within Same class
        //Method name should be same
        //With different input parameters
        // Same methodname with different return types
        //Different sequence of parameters when type is different
        public void test(String name){
            System.out.println("Hello "+name);          
        }

        public void test(int id){
            System.out.println("ID is: "+id);
        }

        public void test(String name, int id){
            System.out.println("Hello " + name + " ID is: " + id);
        }

        public void test(int id, String name){
            System.out.println("ID is: " + id + " Name is: " + name);
        }

        public static void main(String[] args) {
            hMethodOVerLoading object = new hMethodOVerLoading();
            object.test("TestUser");
            object.test(1);
            object.test("TestUser",1);
            object.test(1, "TestUser");
        }
        
}
