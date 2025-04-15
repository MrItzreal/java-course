public class App {
    public static void main(String[] args) {
        /*
         * method: a block of code that is executed
         * whenever it is called upon.
         */

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);
    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

}

/*
 * public class App {
 * public static void main(String[] args) {
 * /*
 *
 * String name = "Izzy";
 * int age = 21;
 * 
 * hello(name, age);
 * }
 * 
 * // Do not confused an argument with a param.
 * // the "name" "age" below are params and as long as it
 * // matches the pattern of the above name, age the argument
 * // will print "Izzy" and "21":
 * static void hello(String name, int age) {
 * System.out.println("Hello " + name);
 * System.out.println("You are " + age + " years old");
 * 
 * }
 * }
 */