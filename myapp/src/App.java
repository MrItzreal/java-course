public class App {
    public static void main(String[] args) {

        // Initial value
        int benchPress = 300;

        if (benchPress == 250) {
            System.out.println("You are a strong fella!");
        } else if (benchPress >= 250) {
            System.out.println("You are built different!");
        } else if (benchPress >= 180) {
            System.out.println("You are almost there!");
        } else if (benchPress <= 100) {
            System.out.println("You need to get stronger!");
        } else {
            System.out.println("You need to press at least 250!");
        }
    }
}
