public class MissingTo8 {
    // int is the type of data / value the method returns
    static int myMethod(int x) {
        // Use of return in a method.
        // The method returns the sum of the number
        // we have used as an argument of the method
        // and the number 5
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}
