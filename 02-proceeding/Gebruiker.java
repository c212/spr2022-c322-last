import java.util.ArrayList; 
import java.awt.event.*; // for the events 

public class Gebruiker extends View {
  public Gebruiker(String name) {
    super(name);  
    this.screen = new Screen(); // Scherm(); // my version of a Screen 
    this.screen.addMouseMotionListener(this); 
    this.screen.addMouseListener(this); 
    this.screen.addKeyListener(this); // check this (*) 
    this.frame.add(this.screen); 
  }
  public void remember(Controller controller) {
    this.controller = controller;  
  }
  public void houdoe(String message) { // howAreYou is teh 
    ((Screen)this.screen).show( this.name + ": " + message ); 
    System.out.println("   ----->    Time is passing... " + this.name + " receiving " + message); 
    // here we draw the world (model) by having a custom Screen and calling its draw function <--- draw 
  }
  public void mousePressed(MouseEvent e) {
    this.controller.receive(e);  
  }
  public void keyTyped(KeyEvent e) {
    this.controller.receive(e);  
  }
}