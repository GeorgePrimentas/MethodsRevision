import java.util.Scanner;

public class MyCalculator {
    // Defines a method called "addMethod" that returns a double type
    // of number, which is the sum of the two numbers passed when the
    // method is called
    static double addMethod(double num1, double num2) {
        return num1 + num2;
    }

    static double subtractMethod(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplyMethod(double num1, double num2) {
        return num1 * num2;
    }

    static double divideMethod(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please input the second number: ");
        double num2 = input.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + addMethod(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtractMethod(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplyMethod(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divideMethod(num1, num2));
    }
}
