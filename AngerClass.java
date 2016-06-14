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
import javafx.stage.Stage;


public class AngerClass extends Game{
  static int numAng = 0;
  public static void startAnger(){
	 numAng = 0;
    Stage window = new Stage();
    window.setTitle("Anger!");
    window.setWidth(300);
    window.setHeight(400);
    
    
    VBox a = new VBox(50);
    
    Button anger = new Button("HIT ME I DARE YOU");
    Label label = new Label();
    anger.setOnAction( e -> {
    	label.setText("Number of Clicks: " + ++numAng);
    	if(numAng == 100){
    		Button exit = new Button("EXIT");
    		exit.setOnAction(f -> window.close());
    		a.getChildren().addAll(exit);
    	}
    });

    a.getChildren().add(anger);
    
    
    
    
    a.getChildren().addAll(label);
    a.setAlignment(Pos.CENTER);
    Scene scene = new Scene(a, 600, 600);
    window.setScene(scene);
    window.show();
    
    
    
  }
	
}
