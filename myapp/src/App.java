public class App {
    public static void main(String[] args) {
        /*
         * Wrapper class = Allows to use primitive data types as reference data types.
         * reference data types contains useful methods that can be used with
         * collections(ex.ArrayList).
         * 
         * //primitives
         * - boolean
         * - char
         * - int
         * - double
         * 
         * //wrapper
         * - Boolean
         * - Character
         * - Integer
         * - Double
         * 
         * autoboxing: The automatic conversion that the Java compiler makes between the
         * primitive types and their corresponding object wrapper classes.
         * 
         * unboxing: The reverse of autoboxing. Automatic conversion of wrapper class to
         * primitive.
         */

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Izzy";

        // Examples of unboxing:
        if (a == true) {
            System.out.println("'a' is true!");
        }
        if (b == '@') {
            System.out.println("'b' is true!");
        }
        if (c == 123) {
            System.out.println("'c' is true!");
        }
        if (d == 3.14) {
            System.out.println("'d' is true!");
        }
        if (e == "Izzy") {
            System.out.println("'e' is true!");
        }
    }
}
