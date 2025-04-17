public class App {
    public static void main(String[] args) {
        /*
         * printf(): an optional method to control, format, and display text
         * to the console window. This is different from the "println" and "print".
         * printf needs two arguments:
         * a format string + (object/variable/value).
         * 
         * NOTES:
         * - %: format specifier: [flags] [precision] [width] [conversion-character].
         * - Depending where I add the %d the argument within the format string will
         * move.
         * - %d the 'd' is a conversion character this one is for ints and decimals.
         * There are other as well.
         */

        // System.out.printf("This is a format string %d", 123);
        // System.out.printf("%d This is a format string", 123);
        // System.out.printf("This is a %d format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Izzy";
        int myInt = 50;
        double myDouble = 1000;

        /*
         * [conversion-character]:
         * b: booleans.
         * c: characters.
         * s: strings.
         * d: intergers.
         * f: floats or doubles.
         */

        // System.out.printf("%b ", myBoolean);
        // System.out.printf("%c ", myChar);
        // System.out.printf("%s ", myString);
        // System.out.printf("%d ", myInt);
        // System.out.printf("%f ", myDouble);

        /*
         * [width]: minimum number of characters to be written as output. The
         * number in this case '10' is the amount of space between the string and
         * value. If the number is negative like '-10' then the spaces are on the
         * opposite (right side).
         */
        // System.out.printf("Hello %10s", myString);
        // System.out.printf("Hello %-10s", myString);

        /*
         * [precision]: sets number of digits of precision when outputting
         * floating-point values. For instance, '.2' will limit the amount of
         * digits that will appear after the decimal portion.
         */
        // System.out.printf("You have this much money %.2f", myDouble);

        /*
         * [flags]: adds an effect to output based on the flag
         * added to format specifier.
         * 
         * - : left-justify
         * + : output a plus (+) or minus (-) sign for a numeric value.
         * 0 : numeric values are zero-padded.
         * , : comma grouping separator if numbers > 1000.
         */
        // System.out.printf("You have this much money %20f", myDouble);
        // System.out.printf("You have this much money %+f", myDouble);
        // System.out.printf("You have this much money %020f", myDouble);
        // System.out.printf("You have this much money %,f", myDouble);

    }
}
