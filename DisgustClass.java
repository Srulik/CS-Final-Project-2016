import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.media;


public class DisgustClass() extends Application{
  public static void main(String[] args){
    launch(args);
  }
  
  public void start() throws Exception{
    Stage window = new Stage();
    window.setTitle("Disgust!");
    window.setWidth(300);
    window.setHeight(400);
    
    Button disgust = new Button("Wanna watch this video?");
    disgust.setOnAction( e -> /*https://www.youtube.com/watch?v=XM9pmmrKXKA*/);
    a.getChildren().add(disgust);
    
    Button exit = new Button("EXIT");
    exit.setOnAction(e -> window.close());
    a.getChildren().add(exit);
    
    VBox a = new VBox(50);
    a.getChildren.addAll(disgust, exit);
    
    Scene scene = new Scene(a, 600,600);
    window.setScene(scene);
    window.show();
    
   // MediaPlayer play - new MediaPlayer();
  }

}
