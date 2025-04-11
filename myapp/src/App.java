public class App {
    public static void main(String[] args) {
        /*
         * String = a reference data type that can store one or more characters.
         * // Reference data types have access to useful methods.
         */

        String name = "Izzy";

        // Using the .equals:
        boolean result = name.equals("Izzy");

        // To avoid case sensitivity:
        boolean result2 = name.equalsIgnoreCase("izzy");

        // Get the "length" of the string:
        int result3 = name.length();

        // Returns the char value at the specified index:
        char result4 = name.charAt(0);

        // Returns a character and returns that index of it:
        int result5 = name.indexOf("y");

        // Returns true/false if the string is empty:
        boolean result6 = name.isEmpty();

        // String to Uppercase:
        String result7 = name.toUpperCase();

        // String to Lowercase:
        String result8 = name.toLowerCase();

        // Removes the empty space from a string:
        String result9 = name.trim();

        // Replace a character string with another:
        String result10 = name.replace("Izzy", "Call Me!");

        System.out.println("String Methods:");
        System.out.println(".equals: " + result);
        System.out.println(".equalsIgnoreCase: " + result2);
        System.out.println(".length: " + result3);
        System.out.println(".charAt: " + result4);
        System.out.println(".indexOf: " + result5);
        System.out.println(".isEmpty: " + result6);
        System.out.println(".toUpperCase: " + result7);
        System.out.println(".toLowerCase: " + result8);
        System.out.println(".trim: " + result9);
        System.out.println(".replace: " + result10);
    }
}
