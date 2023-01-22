package lConstructors;

public class Employee {
    String name;
    int age;
    int id;
    String designation;
    	//const...
	//1. const... name will remain same as the class name
	//2. const... will not have any return trype/no void/no return keyword
	//3. const.. looks like a function but not a fnction
	//4. const.. overloading is possible
	//5. default const... depneds on use cases...N number of objetcs...
	
	//const vs func:
	//1. const... name will remain same...but function  name can be anything
	//2. const.. will never have any return but func may or may not return the value
	//3. const.. will be called when you create the Object but mthod will be called with object reference
	//4. const.. will help to create the Object of the class, we can restrict unnecessary object creation
	//5. func should have the buss logic, should define feature of the class. But const should not have any buss logic

    //default constructor
    public Employee(){
        System.out.println("Default constructor called");
    }
    
    // parameterized constructor
    
    // With this keyword you can access all the class variables
    public Employee(String name, int age, int id, String designation) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.designation = designation;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(int id, int age) {
        this.id = id;
    }

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    
    public static void main(String[] args) {
        // constructor will be called when you create the Object
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ravi");
        Employee e3 = new Employee(22);
        Employee e4 = new Employee("User1",22,12, "Manager");
        System.out.println(e4.name);
        
    }
    
}
