public class MainMultiples {
    static void myMethod () {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        // myMethod method is called three times in a row
        myMethod();
        myMethod();
        myMethod();
    }
}
