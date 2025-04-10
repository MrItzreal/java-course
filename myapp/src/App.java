import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // while loop = executes a block of code as long as its's condition remains true
        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
        // It's good practice to close your scanner:
        scanner.close();

        // while loop with int ex:
        int count = 10;
        while (count > 0) {
            System.out.println("Counting.... " + count);
            count--;
        }
        System.out.print("The final count is: " + count);

        /*
         * do loop = executes block of code at least one and then it checks condition
         * do {
         * System.out.print("Enter your name: ");
         * name = scanner.nextLine();
         * } while (name.isBlank());
         * System.out.println("Hello " + name);
         */
    }
}
