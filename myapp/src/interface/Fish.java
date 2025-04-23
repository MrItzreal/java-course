public class Fish implements Prey, Predator {

  @Override
  public void hunt() {
    System.out.println("This fish hunts smaller fish");
  }

  @Override
  public void flee() {
    System.out.println("This fish flees from bigger fish");
  }
}
