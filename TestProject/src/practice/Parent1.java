package practice;

public class Parent1 {

	    public static void main(String[] args) {
	        // Reference type Parent, Object type Child
	        Parent obj = new Child();

	        // Call static method (resolved at compile time)
	        obj.staticMethod();  // Output: Static method in Parent

	        // Call instance method (resolved at runtime)
	        obj.instanceMethod(); // Output: Instance method in Child
	    }
	}


