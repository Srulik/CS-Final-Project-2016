import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JoyClass() extends Application{
  public static void main(String[] args){
    launch(args);
  }

  public void start(){
    Stage window = new Stage();
    window.setTitle("Joy!");
    window.setWidth(300);
    window.setHeight(400);
    
    Label message = new Label("You are now happy ! Have a nice day :)");
    Button exit = new Button("EXIT");
    exit.setOnAction(e -> window.close());
    
    VBox a = new VBox(500);
    a.getChildren.addAll(message, exit);
    
    Scene scene = new Scene(a, 600,600);
    window.setScene(scene);
    window.show();
  }

}


