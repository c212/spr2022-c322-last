import java.util.ArrayList; 

public abstract class Model {
  public ArrayList<Controller> clients; 
  public ArrayList<View> views; 
  public Model() {
    this.clients = new ArrayList<Controller>();  
    this.views = new ArrayList<View>();  
  }
}
