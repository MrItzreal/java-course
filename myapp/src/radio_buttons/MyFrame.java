import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

  JRadioButton pizzaBtn;
  JRadioButton hamburgerBtn;
  JRadioButton hotdogBtn;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    pizzaBtn = new JRadioButton("Pizza");
    hamburgerBtn = new JRadioButton("Hamburger");
    hotdogBtn = new JRadioButton("HotDog");

    ButtonGroup group = new ButtonGroup();
    group.add(pizzaBtn);
    group.add(hamburgerBtn);
    group.add(hotdogBtn);

    pizzaBtn.addActionListener(this);
    hamburgerBtn.addActionListener(this);
    hotdogBtn.addActionListener(this);

    this.add(pizzaBtn);
    this.add(hamburgerBtn);
    this.add(hotdogBtn);
    this.pack(); // size of frame adjust to fit components.
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == pizzaBtn) {
      System.out.println("You ordered pizza!");
    } else if (e.getSource() == hamburgerBtn) {
      System.out.println("You ordered hamburger!");
    } else if (e.getSource() == hotdogBtn) {
      System.out.println("You ordered hotdog!");
    }
  }
}