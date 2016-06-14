package net.mrpaul.ads.TM250.project;

import java.io.File;

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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class DisgustClass extends Game{
  
  public void startDisgust(){
    Stage window = new Stage();
    window.setTitle("Disgust!");
    window.setWidth(625);
    window.setHeight(535);
    
    VBox a = new VBox(50);
    
    MediaPlayer mediaPlayer = new MediaPlayer(new Media(getClass().getResource("satisfyingVid.mp4").toExternalForm()));
    MediaView mediaView = new MediaView(mediaPlayer);
    
    
    Button disgust = new Button("Wanna watch this video?");
    disgust.setOnAction( e -> {mediaPlayer.play();
    a.getChildren().add(mediaView);});
    a.getChildren().add(disgust);
    
    Button exit = new Button("EXIT");
    exit.setOnAction(e -> {
    mediaPlayer.stop();
    window.close();}
    );
    a.getChildren().add(exit);
    
    a.setAlignment(Pos.CENTER);
    Scene scene = new Scene(a, 600,600);
    window.setScene(scene);
    window.show();
    
   // MediaPlayer play - new MediaPlayer();
  }
}
