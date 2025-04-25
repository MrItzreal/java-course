import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
  public static void main(String[] args) {
    /*
     * 1-) Layout Manager = defines the natural layout for components within a
     * container.
     * 2-) 3 common managers.
     * 3-) BorderLayout = A BorderLayout places components in 5 areas: NORTH, SOUTH,
     * WEST, EAST, CENTER.
     * 4-) All extra space is placed in the center area.
     */

    // JFRAMES
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new BorderLayout(10, 10)); // if you need to add marging between components you can pass them in
    frame.setVisible(true);

    // JPANELS
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.yellow);
    panel4.setBackground(Color.magenta);
    panel5.setBackground(Color.blue);

    panel1.setPreferredSize(new Dimension(100, 100));
    panel2.setPreferredSize(new Dimension(100, 100));
    panel3.setPreferredSize(new Dimension(100, 100));
    panel4.setPreferredSize(new Dimension(100, 100));
    panel5.setPreferredSize(new Dimension(100, 100));

    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.WEST);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.SOUTH);
    frame.add(panel5, BorderLayout.CENTER);
  }
}
