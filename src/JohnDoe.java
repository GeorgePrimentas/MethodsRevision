public class JohnDoe {
    // Adding/"Declaring" String parameter called "firstName"
    static void myMethod(String firstName) {
        // Using the parameter in the method
        System.out.println(firstName + " Doe");
    }

    public static void main(String[] args) {
        // Calling myMethod method with the value "John"
        // as the argument
        myMethod("John");
    }
}
