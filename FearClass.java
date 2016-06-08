import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FearClass() extends Application{
  public static void main(String[] args){
    launch(args);
  }
  
  public void start(){
    Stage window = new Stage();
    window.setTitle("Fear...>.<");
    window.setWidth(300);
    window.setHeight(400);
    
    VBox a = new VBox(50);
    
    Button fear = new Button("Watch this video; you'll be happy again!");
    anger.setOnAction( e -> https://www.youtube.com/watch?v=-dxSqylZ5kM);
    a.getChildren().add(fear);
    
    Button exit = new Button("EXIT");
    exit.setOnAction(e -> window.close());
    a.getChildren().add(exit);
    
    Scene scene = new Scene(a, 600, 600);
    window.setScene(scene);
    window.show();
  }
}
