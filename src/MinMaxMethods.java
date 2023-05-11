import java.util.Scanner;

public class MinMaxMethods {

    // Method that takes 3 arguments (3 integer numbers)
    static int minNumber(int num1, int num2, int num3) {
        // the minimum is initiated as equal to the first
        // number the user has input
        int minimum = num1;
        // If the user's second number is less than the
        // minimum (num1 for the time being), num2 becomes
        // the minimum
        if (num2 < num1) minimum = num2;
        // If the user's third number is even less, num3
        // becomes the minimum
        if (num3 < num2) minimum = num3;
        // The minNumber method returns the minimum number
        // as an integer
        return minimum;
    }
    // Method that takes 3 arguments (3 integer numbers)
    // and returns the minimum
    static int maxNumber(int num1, int num2, int num3) {
        int maximum = num1;
        if (num2 > num1) maximum = num2;
        if (num3 > num2) maximum = num3;
        return maximum;
    }

    // Overloading - The next two methods work similarly to the
    // previous two except that they handle (and return) double
    // type of values / data
    static double minNumber(double num1, double num2, double num3) {
        double minimum = num1;
        if (num2 < num1) minimum = num2;
        if (num3 < num2) minimum = num3;
        return minimum;
    }

    static double maxNumber(double num1, double num2, double num3) {
        double maximum = num1;
        if (num2 > num1) maximum = num2;
        if (num3 > num2) maximum = num3;
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println("Please input 3 (whole) numbers and I will display the minimum and the maximum of the three");
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the 1st number: ");
        double num1 = Double.parseDouble(input.nextLine());
        System.out.print("Please insert the 2nd number: ");
        double num2 = Double.parseDouble(input.nextLine());
        System.out.print("Please insert the 3rd number: ");
        double num3 = Double.parseDouble(input.nextLine());
        // Checking if all input numbers are integers
        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0) {
            // If they are the arguments in the methods are passed
            // as integers and thus the return of the methods will
            // be integer numbers
            System.out.println("Minimum is: " + minNumber((int) num1, (int) num2, (int) num3));
            System.out.println("Maximum is: " + maxNumber((int) num1, (int) num2, (int) num3));
        } else {
            // Otherwise (if not ALL input numbers are integers)
            // the arguments in the methods are passed doubles and
            // thus the return of the methods will be double numbers
            System.out.println("Minimum is: " + minNumber(num1, num2, num3));
            System.out.println("Maximum is: " + maxNumber(num1, num2, num3));
        }
    }
}
