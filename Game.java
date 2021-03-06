package net.mrpaul.ads.TM250.project;

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
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Game extends Application{
  public static void main(String[] args){
	  launch(args);
  }
  
  static int plays = 0;
  MediaPlayer mediaPlayer = new MediaPlayer(new Media(getClass().getResource("satisfyingVid.mp4").toExternalForm()));
  
  public void start(Stage p){

	Stage window = p;
    window.setTitle("Game");
    window.setMinWidth(300);
    window.setMinHeight(400);
    
    Label label = new Label();
    label.setText("How are you feeling right now?");
    Label space = new Label();
    space.setText("");
 
    Stage joyStage = new Stage();
    Button joy = new Button("Joy");
    joy.setOnAction(e -> {
	JoyClass.startJoy();
	window.close();
		});
    
    /*
    Button sad = new Button("Sad");
    sad.setOnAction(e -> {
	SadClass.start();		
		});
		
		*/
		
	Stage fearStage = new Stage();
    Button fear = new Button("Stressed");
    fear.setOnAction(e -> {
    FearClass f = new FearClass();
    f.startFear();
	plays++;
	});
    
    
	Stage disgustStage = new Stage();
    Button disgust = new Button("Disgust");
    disgust.setOnAction(e -> {
    DisgustClass d = new DisgustClass();
    d.startDisgust();
	plays++;
		});
		
    Stage angerStage = new Stage();
    Button anger = new Button("Anger");
    anger.setOnAction(e -> {
	AngerClass.startAnger();
	plays++;
		});
		
	VBox buttons = new VBox();
	buttons.getChildren().addAll(label, space, joy, anger, disgust, fear); //add sad, fear
	BorderPane layout = new BorderPane();;
	BorderPane.setAlignment(buttons, Pos.CENTER);
	layout.setCenter(buttons);
	buttons.setAlignment(Pos.CENTER);
	VBox full = new VBox();
	full.setAlignment(Pos.CENTER);;
	full.getChildren().addAll(layout);
	Scene scene = new Scene(full);
	window.setScene(scene);
	window.show();
  }
  
}
