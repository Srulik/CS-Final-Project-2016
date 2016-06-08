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
    int numAng = 0;
    
    VBox a = new VBox(50);
    
    Button anger = new Button("HIT ME I DARE YOU");
    anger.setOnAction( e -> numAng++ );
    a.getChildren().add(anger);
    
    if(numANg >= 100){
      Button exit = new Button("EXIT");
      exit.setOnAction(e -> window.close());
      a.getChildren().add(exit);
    }
    
    Scene scene = new Scene(a, 600, 600);
    window.setScene(scene);
    window.show();
    
    
    
  }
}
