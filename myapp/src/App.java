public class App {
    public static void main(String[] args) {
        /*
         * 'final' keyword: anything declared as final cannot
         * be changed nor updated later in the program.
         * 
         * A common practice when using final not mandatory but common practice
         * the variable name will be in uppercased.
         */

        final double PI = 3.14159;
        // PI = 4; // PI will not update to 4 because is final.
        System.out.println(PI);
    }
}
