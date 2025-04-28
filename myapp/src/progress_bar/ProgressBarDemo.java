import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.Color;

public class ProgressBarDemo {
  JFrame frame = new JFrame();
  JProgressBar bar = new JProgressBar();

  ProgressBarDemo() {
    bar.setValue(0);
    bar.setBounds(0, 0, 420, 50);
    bar.setStringPainted(true); // adds percentage text to the bar.
    bar.setFont(new Font("MV Boli", Font.PLAIN, 25));

    // Set the foreground color (progress)
    bar.setForeground(Color.red);

    // Set the background color (empty space)
    bar.setBackground(Color.black);

    // Ensure that the progress bar's background is visible
    bar.setOpaque(true); // Make the background color visible

    frame.add(bar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(null);
    frame.setVisible(true);

    fill();
  }

  public void fill() {
    int counter = 0;

    while (counter <= 100) {
      bar.setValue(counter);
      try {
        Thread.sleep(50); // Adjust the speed of progress
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      counter += 1;
    }
    bar.setString("Done!");
  }

  public static void main(String[] args) {
    new ProgressBarDemo();
  }
}
