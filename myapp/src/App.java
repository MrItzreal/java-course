public class App {
    public static void main(String[] args) {
        /*
         * The numbers within the array is the size of the array if
         * you are not planning to assign a size right away.
         * 
         * data type/name/size of array:
         * int[] numbers = new int[3];
         * char[] characters = new char[4];
         * String[] strings = new String[5];
         */

        /*
         * This declares our array + adding its size
         * Food[] refrigerator = new Food[3];
         */
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");
        
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        // This immediately declares and adds the size
        Food[] refrigerator = { food1, food2, food3 };

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
