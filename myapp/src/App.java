import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /*
         * for-each loop = traversing technique to iterate through the
         * elements in an array/collection. Requires less steps,
         * more readable but less flexible compared to a for-loop.
         * 
         * NOTE:
         * ':'= the word in.
         * for-each loops are also referred as enhanced for-loops.
         */

        // 1st example:
        String[] nissan = { "rogue", "pathfinder", "kick", "murano" };
        for (String i : nissan) {
            System.out.println(i);
        }

        // 2nd example:
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("rat");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
