import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.event.*; // the three interfaces below 

public abstract class View implements MouseMotionListener, 
                                      MouseListener, 
                                      KeyListener 
{
  String name; 
  JFrame frame; 
  JComponent screen = new Screen(); // [1] 
  Controller controller; 
  public View(String name) {
    this.name = name;     
    this.frame = new JFrame(name); 
    // this.frame.add(this.screen); // from [1] 
    this.frame.setVisible(true); 
    this.frame.setSize(400, 400); 
  }
  public abstract void remember(Controller controller); 
  public void mouseMoved(   MouseEvent e) { } // this.controller.receive(e); } 
  public void mouseDragged( MouseEvent e) { } // this.controller.receive(e); }
  
  public void mouseEntered( MouseEvent e) { } // this.controller.receive(e); }
  public void mouseExited(  MouseEvent e) { } // this.controller.receive(e); }
  public void mousePressed( MouseEvent e) { } // this.controller.receive(e); }
  public void mouseReleased(MouseEvent e) { } // this.controller.receive(e); }
  public void mouseClicked( MouseEvent e) { } // this.controller.receive(e); }
  
  public void keyPressed(   KeyEvent   e) { } // this.controller.receive(e); }
  public void keyReleased(  KeyEvent   e) { } // this.controller.receive(e); }
  public void keyTyped(     KeyEvent   e) { } // this.controller.receive(e); }
}