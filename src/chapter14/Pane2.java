package chapter14;

import java.awt.Checkbox;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pane2 extends Application {
		  public void start(Stage primaryStage) {

			StackPane pane = new StackPane();  
			VBox pane2 = new VBox();
			Checkbox b = new Checkbox("guanbi");
			
			pane.getChildren().add(new Button("OK"));
			pane.getChildren().add(new Button("ccC"));
			//pane.getChildren().add(b);
			
			Scene scene = new Scene(pane,500,100);
		    primaryStage.setTitle("MY_FIRST_JAVAFX-PRO"); // Set the stage title
		    primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show(); // Display the stage
		  }
		  
	  public static void main(String[] args){
			Application.launch(args);
	}

} 