import java.awt.Color; 
import java.awt.event.MouseEvent; 

public class Begeleider extends Controller {
  public Begeleider(View view) {
    super(view);  
  }
  public void registerWith(Model model) {
    this.model = model;  
    this.model.clients.add( this ); // adding myself as a controller 
    this.model.views.add( this.view ); // adding myself as a controller 
    // make sure this is synchronized (critical region)
  }    
  public void receive(Object e) {
    // based on the type of event modify the model 
    System.out.println( this + " " + this.view.name + " " + e ); 
  }
}
