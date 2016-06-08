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
  
  public static void startAnger(){
    Stage window = new Stage();
    window.setTitle("Anger!");
    window.setWidth(300);
    window.setHeight(400);
    int numAng = 0;
    
    VBox a = new VBox(50);
    
    Button anger = new Button("HIT ME I DARE YOU");
    /*
    anger.setOnAction( e -> numAng++ );
    a.getChildren().add(anger);
    */
    //if(numAng >= 100){
      Button exit = new Button("EXIT");
      exit.setOnAction(e -> window.close());
      a.getChildren().addAll(anger, exit);
    //}
    
    Scene scene = new Scene(a, 600, 600);
    window.setScene(scene);
    window.show();
    
    
    
  }
	
}
