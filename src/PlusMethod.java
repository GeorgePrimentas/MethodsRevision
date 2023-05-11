public class PlusMethod {

    // Defines a method which takes two integer
    // parameters (int x, int y) and returns
    // their sum as an integer (int - return type)

    static int plusMethod(int x, int y) {
        return x + y;
    }

    // Defines a method which takes two double
    // parameters (double x, double y) and returns
    // their sum as a double number (double - return type)
    static double plusMethod(double x, double y) {
        return x + y;
    }

    // The two methods have the same name but differ in the type
    // (int vs double) of their parameters. This is called method
    // overloading and it makes the code more readable and
    // maintainable. When a method (of the same name) is called
    // the compiler will decide which method to call depending on
    // the type or the number of arguments.

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
