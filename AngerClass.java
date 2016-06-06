import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AngerClass() extends Application{
  public static void main(String[] args){
    launch(args);
  }
  
  public void start(){
    Stage window = new Stage();
    window.setTitle("Anger!");
    window.setWidth(300);
    window.setHeight(400);
    
    window.show();
    
    
    Label message = new Label("You are now happy ! Have a nice day :)");
    Button exit = new Button("EXIT");
    exit.setOnAction(e -> window.close());
  }
}
