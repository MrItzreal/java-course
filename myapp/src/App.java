import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1;
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}

/*
 * Since numbers start at 0 we add +1,
 * so we can get a random # from 0-6.
 */
