package Forgot_to_make_file;
import java.util.Random;

/*
 * You can pass instances through arguments
 * public class DiceRoller {
 * // DiceRoller is a constructor here
 * DiceRoller() {
 * Random random = new Random();
 * int number = 0;
 * roll(random, number);
 * }
 * 
 * void roll(Random random, int number) {
 * // +1 to secure a random number from 0-6 without it's just 0-5.
 * number = random.nextInt(6) + 1;
 * System.out.println(number);
 * }
 * }
 */

// You can also pass instances globally as well
public class DiceRoller {
  Random random;
  int number;

  DiceRoller() {
    random = new Random();
    roll();
  }

  void roll() {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }
}
