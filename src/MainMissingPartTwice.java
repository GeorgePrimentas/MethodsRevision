public class MainMissingPartTwice {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        // Filling the missing part to call
        // myMethod from main twice
        myMethod();
        myMethod();
    }
}
