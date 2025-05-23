import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

  JButton button;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout((new FlowLayout()));

    button = new JButton("Select a file");
    button.addActionListener(this);

    this.add(button);
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      JFileChooser fileChooser = new JFileChooser();

      int response = fileChooser.showOpenDialog(null); // selects file to open
      // int response = fileChooser.showSaveDialog(null); // selects file to save

      if (response == JFileChooser.APPROVE_OPTION) {
        File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
        System.out.println(file);
      }
    }
  }
}
