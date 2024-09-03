package typecasting;
class Parent {
    // Non-static methods
    public void parentNonStaticMethod1() {
        System.out.println("Parent non-static method 1");
    }

    public void parentNonStaticMethod2() {
        System.out.println("Parent non-static method 2");
    }

    // Static methods
    public static void parentStaticMethod1() {
        System.out.println("Parent static method 1");
    }

    public static void parentStaticMethod2() {
        System.out.println("Parent static method 2");
    }
}

class Child extends Parent {
    // Non-static methods
    public void childNonStaticMethod1() {
        System.out.println("Child non-static method 1");
    }

    public void childNonStaticMethod2() {
        System.out.println("Child non-static method 2");
    }

    // Static methods
    public static void childStaticMethod1() {
        System.out.println("Child static method 1");
    }

    public static void childStaticMethod2() {
        System.out.println("Child static method 2");
    }
}

public class UPcasting_1 {
    public static void main(String[] args) {
        // Upcasting
        Parent parentRef;

        // Creating a Child object
        Child child = new Child();

        // Upcasting: Child to Parent
        parentRef = child;

        System.out.println("Upcasting:");
        parentRef.parentNonStaticMethod1(); // Calls Parent's method
        parentRef.parentNonStaticMethod2(); // Calls Parent's method
        Parent.parentStaticMethod1(); // Calls Parent's static method
        Parent.parentStaticMethod2(); // Calls Parent's static method

        // Note: The static methods of the Child class are not accessible via Parent reference

        // Downcasting
        if (parentRef instanceof Child) {
            Child childRef = (Child) parentRef;

            System.out.println("\nDowncasting:");
            childRef.childNonStaticMethod1(); // Calls Child's method
            childRef.childNonStaticMethod2(); // Calls Child's method
            Child.childStaticMethod1(); // Calls Child's static method
            Child.childStaticMethod2(); // Calls Child's static method
        } else {
            System.out.println("Downcasting failed.");
        }
    }
}

