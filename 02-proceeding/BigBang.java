import javax.swing.Timer; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class BigBang extends Model implements ActionListener {
  Timer timer; 
  public BigBang(int delay) {
    this.timer = new Timer(delay, this); // addActionListener 
  }
  public void actionPerformed(ActionEvent e) {
    // System.out.println( e ); 
  }
  public void start() {
    this.timer.start();  
  }
}