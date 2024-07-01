import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flower extends JPanel {
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Draw petals
    g.setColor(Color.pink);
    g.fillOval(50, 50, 50, 50);
    g.fillOval(80, 70, 50, 50);
    g.fillOval(60, 100, 50, 50);
    g.fillOval(30, 100, 50, 50);
    g.fillOval(10, 70, 50, 50);
    // Draw stem
    g.setColor(Color.green);
    g.fillRect(50, 150, 10, 100);
    // Draw center
    g.setColor(Color.yellow);
    g.fillOval(50, 75, 50, 50);
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Flower");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(150, 300);
    flower flower = new flower();
    frame.add(flower);
    frame.setVisible(true);
  }
}
