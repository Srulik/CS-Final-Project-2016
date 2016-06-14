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


public class JoyClass extends Game{

	  public static void startJoy(){
	    Stage window = new Stage();
	    window.setTitle("Joy!");
	    window.setWidth(300);
	    window.setHeight(400);
	    
	    Label message = new Label("You are happy now! Have a nice day :)");
	    Label played = new Label("You played " + plays + " games!");
	    
	    Button exit = new Button("EXIT");
	    exit.setOnAction(e -> window.close());
	    
	    VBox a = new VBox(50);
	    a.getChildren().addAll(played, message, exit);
	    
	    a.setAlignment(Pos.CENTER);
	    Scene scene = new Scene(a, 600,600);
	    window.setScene(scene);
	    window.show();
	  }

	}
