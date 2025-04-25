import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    /*
     * Layout Manager = Defines the natural layout for component within a container.
     * FlowLayout = places components in a row, sized at their preferred size.
     * If the horizontal space in the container is too small, the FlowLayout class,
     * users the next available row.
     */

    // JFRAMES
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // You can position as: LEADING, CENTER, TRAILING

    // JPANELS
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(250, 250));
    panel.setBackground(Color.lightGray);
    panel.setLayout(new FlowLayout());

    panel.add(new JButton("1"));
    panel.add(new JButton("2"));
    panel.add(new JButton("3"));
    panel.add(new JButton("4"));
    panel.add(new JButton("5"));
    panel.add(new JButton("6"));
    panel.add(new JButton("7"));
    panel.add(new JButton("8"));
    panel.add(new JButton("9"));

    frame.add(panel);

    // JButton button1 = new JButton(); This is one way to create buttons
    // This is a shorcut
    // frame.add(new JButton("1"));
    // frame.add(new JButton("2"));
    // frame.add(new JButton("3"));
    // frame.add(new JButton("4"));
    // frame.add(new JButton("5"));
    // frame.add(new JButton("6"));
    // frame.add(new JButton("7"));
    // frame.add(new JButton("8"));
    // frame.add(new JButton("9"));

    frame.setVisible(true); // adding this at the end makes it visible immediately.

  }
}
