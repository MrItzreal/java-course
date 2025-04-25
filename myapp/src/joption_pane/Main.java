import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    /*
     * JOptionPane = pop up a standard dialog box that prompts
     * users for a value or informs them of something.
     * 
     * 5 types of panes: Plain, information, question, warning, error.
     */

    JOptionPane.showMessageDialog(
        null,
        "This is plain text!",
        "Plain Msg",
        JOptionPane.PLAIN_MESSAGE);

    JOptionPane.showMessageDialog(
        null,
        "This is information!",
        "Information Msg",
        JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(
        null,
        "This is a question?",
        "Question Msg",
        JOptionPane.QUESTION_MESSAGE);

    JOptionPane.showMessageDialog(
        null,
        "This is a warning!",
        "Warning Msg",
        JOptionPane.WARNING_MESSAGE);

    JOptionPane.showMessageDialog(
        null,
        "This is an error!",
        "Error Msg",
        JOptionPane.ERROR_MESSAGE);

    int answer = JOptionPane.showConfirmDialog(
        null,
        "Can you bench 250?",
        "Strong or Weak",
        JOptionPane.YES_NO_CANCEL_OPTION);

    String name = JOptionPane.showInputDialog("What is your name?: ");
    System.out.println("Nice to meet you " + name);

    String[] responses = { "No, you're awesome!", "Thanks fam!", "*blush" };
    JOptionPane.showOptionDialog(
        null,
        "You are awesome!",
        "Secret Message",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        // null,
        responses,
        0);
  }
}
