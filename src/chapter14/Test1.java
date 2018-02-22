package chapter14;

import javafx.application.Application;
 import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Test1 extends Application {
	  public void start(Stage primaryStage) {
		  
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setRadius(200);
		circle.setCenterY(100);
		circle.setStroke(javafx.scene.paint.Color.RED);
		circle.setFill(javafx.scene.paint.Color.BLUE);

		  
		Pane pane = new Pane();  
		pane.getChildren().add(circle);
		
	    Scene scene = new Scene(pane,500,100);
	    primaryStage.setTitle("MY_FIRST_JAVAFX-PRO"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  public static void main(String[] args){
			Application.launch(args);
		}

} 