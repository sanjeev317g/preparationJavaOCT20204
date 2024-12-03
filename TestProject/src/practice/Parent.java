package practice;

class Parent {
    // Static method in parent class
    static void staticMethod() {
        System.out.println("Static method in Parent");
    }

    // Instance method in parent class
    void instanceMethod() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    // Static method in child class (method hiding, not overriding)
    static void staticMethod() {
        System.out.println("Static method in Child");
    }

    // Instance method in child class (overriding)
    @Override
    void instanceMethod() {
        System.out.println("Instance method in Child");
    }
}



