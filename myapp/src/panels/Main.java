import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    /*
     * JPanel = GUI component that functions as a container to hold,
     * other components.
     */
    // JLabels
    ImageIcon icon = new ImageIcon("sonic.png");
    JLabel label = new JLabel();
    label.setText("Hi Sonic!");
    label.setIcon(icon);
    label.setVerticalAlignment(JLabel.BOTTOM);
    label.setHorizontalAlignment(JLabel.RIGHT);
    label.setBounds(100, 100, 75, 75);

    // JPanels
    // Red panel
    JPanel redPanel = new JPanel();
    redPanel.setBackground(Color.red);
    redPanel.setBounds(0, 0, 250, 250);
    redPanel.setLayout(null);
    // Blue panel
    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250, 0, 250, 250);
    bluePanel.setLayout(null);
    // Green panel
    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0, 250, 500, 250);
    greenPanel.setLayout(null);

    // JFrame
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(750, 750);
    frame.setVisible(true);
    greenPanel.add(label);
    frame.add(redPanel);
    frame.add(bluePanel);
    frame.add(greenPanel);
  }
}
