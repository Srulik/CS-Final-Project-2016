import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application{
  public static void main(String[] args){
	  launch(args);
  }
  
  public void start(Stage p){
    Stage window = p;
    window.setTitle("Game");
    window.setMinWidth(300);
    window.setMinHeight(400);
    
    Label label = new Label();
    label.setText("How are you feeling right now?");
    
    /*
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
		
		*/
		
    Stage angerStage = new Stage();
    Button anger = new Button("Anger");
    anger.setOnAction(e -> {
	AngerClass.startAnger();		
		});
		
	StackPane buttons = new StackPane();
	buttons.getChildren().addAll(label,anger); //add joy, sad, fear, disgust,
	BorderPane layout = new BorderPane();;
	BorderPane.setAlignment(buttons, Pos.CENTER);
	layout.setCenter(buttons);
	StackPane full = new StackPane();
	full.setAlignment(anger, Pos.CENTER);;
	full.getChildren().addAll(layout);
	Scene scene = new Scene(full);
	window.setScene(scene);
	window.show();
  }
  
}
