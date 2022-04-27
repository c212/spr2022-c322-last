import javax.swing.*; 
import java.awt.*; 

public class Screen extends JComponent {
  String message = "Welcome."; 
  public void show(String message) {
    this.message = message; 
    this.repaint(); 
  }
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D)g; 
    int size = 48;
    Font font = new Font("Dialog", Font.PLAIN, size);
    g2.setFont(font);
    g.drawString( this.message , 30, 200);  // drawing the world 
  }
}