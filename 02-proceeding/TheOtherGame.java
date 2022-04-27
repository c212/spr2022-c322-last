import java.awt.event.ActionEvent; 
import java.util.ArrayList; 
import java.awt.Color;

public class TheOtherGame extends BigBang {
  int theTime = 23; 
  public TheOtherGame(int delay) { 
    super(delay); 
  }
  public void actionPerformed(ActionEvent e) { // overriding method from BigBang 
    this.theTime += 1; 
    for (View view : this.views) { // time passes and we call the teh in the view 
      ((Gebruiker)view).houdoe( this.theTime + "" ); 
                                // model sends them to views
    }
  }
}