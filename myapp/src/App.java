import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);

        // It's good practice to close your scanner:
        scanner.close();
    }
}

/*
 * "Math." use cases:
 * double z = Math.max(x, y); = max value.
 * double z = Math.min(x, y); = min value.
 * double z = Math.abs(y); = absolute value.
 * double z = Math.sqrt(y); = square root of value.
 * double z = Math.round(x); = rounds value.
 * double z = Math.ceil(x); = rounds up value.
 * double z = Math.floor(x); = rounds down value.
 */