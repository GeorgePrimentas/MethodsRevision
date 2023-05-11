public class CheckAge {
    // Create a checkAge() method with an integer variable
    // called age
    static void checkAge (int age) {
        // if age is less than 18, print "Access denied".
        // As the block of code to be executed consists of
        // only one statement, I use the code / statement
        // on the same line with the if condition (or else)
        // omitting the curly braces.
        if (age < 18) System.out.println("Access denied");
        // In any other case (else), print "Access denied".
        else System.out.println("Access granted");
    }

    public static void main(String[] args) {
        // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }
}
