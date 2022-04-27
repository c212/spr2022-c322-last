public abstract class Controller {
  View view; // View[] views;
  public Controller(View view) {
    this.view = view;  
  }
  Model model; 
  public abstract void registerWith(Model model); 
  public abstract void receive(Object event); 
}