public class FibonacciCalc {

    // Defines a method called "fibonacci" that returns a long type
    // of number, has one parameter of integer type of data (int n)
    static long fibonacci(int n) {
        // if the method is called with an integer less than two
        // (i.e. 0 or 1), the method returns the value of the argument
        // itself.
        if (n<2) {
            return n;
        }
        // In any other case, the method returns the sum of the previous
        // two numbers in the Fibonacci sequence (recursion); in other
        // words it returns the sum of what the method would return if we
        // were calling it using the previous two whole numbers as its
        // argument
            else {
        }
        return fibonacci(n-2) + fibonacci (n-1);
    }

    public static void main(String[] args) {
        // The next line displays on the console the first two numbers
        // of the Fibonacci sequence
        System.out.print("0, 1");
        // The loop displays on the console from the 3rd and up
        // to (inclusive) the 50th number of the Fibonacci sequence
        for (int i = 2; i < 50; i++) {
            System.out.print(", " + fibonacci(i));
        }
    }
}


//     // Alternative (much faster) version without
//     // using the recursion technique
//     public static void main(String[] args) {
//
//      System.out.print(0 + ", ");
//      System.out.print(1);
//      long num1 = 0;
//      long num2 = 1;
//      long temporary;
//      for (int i = 3; i <= 50; i++) {
//      temporary = num1 + num2;
//      num1 = num2;
//      num2 = temporary;
//      System.out.print(", " + temporary);
//              }
//          }
//      }