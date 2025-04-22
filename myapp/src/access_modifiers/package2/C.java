package access_modifiers.package2;

import access_modifiers.package1.*;

public class C {
  public String publicMessage = "This is public";
  protected String protectedMessage = "This is protected";
  String defaultMessage = "This is the default";
  private String privateMessage = "This is private";

}

/*
 * public = is visible to any package within the
 * project folder.
 * 
 * 
 * protected = accesible to a different
 * class in a diffrenet package as long as
 * that class is a sub class of the class that
 * contains the protected method
 * 
 * 
 * private = it is
 * only visible to the class that it contains.
 * even if is in within the same package.
 */