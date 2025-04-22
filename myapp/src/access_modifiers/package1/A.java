package access_modifiers.package1;

import access_modifiers.package2.*;

public class A {

  protected String protectedMessage = "This is protected";

  public static void main(String[] args) {

    B b = new B();
    System.out.println(b.privateMessage);
  }
}
