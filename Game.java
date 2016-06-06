import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Game() extends Application{
  public static void main(String[] args){
    
  }
  
  public void start(Stage p){
    Stage window = new Stage();
    window.setTitle("Game");
    window.setMinWidth(300);
    window.setMinHeight(400);
    
    Label label = new Label();
    label.setText("How are you feeling right now?")
    Button joy = new Button("Joy");
    joy.setOnAction(e -> {
	JoyClass.start();		
		});
    
    Button sad = new Button("Sad");
    sad.setOnAction(e -> {
	SadClass.start();		
		});
		
    Button fear = new Button("Fear");
    fear.setOnAction(e -> {
	FearClass.start();		
		});
		
    Button disgust = new Button("Disgust");
    disgust.setOnAction(e -> {
	DisgustClass.start();		
		});
		
    Button anger = new Button("Anger");
    anger.setOnAction(e -> {
	AngerClass.start();		
		});
  }
  
}
