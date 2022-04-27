public class Simulation {
  public static void main(String[] args) {
    Model model = new TheOtherGame(1000);  
    for (String name : args) {
      System.out.println( name );  
      View view = new Gebruiker(name); // Client (equivalent of Display) 
      Controller controller = new Begeleider(view); // Attendant (like PlayerAttendant) 
      view.remember(controller); 
      controller.registerWith(model); 
    }
    ((BigBang)model).start(); 
  }
}