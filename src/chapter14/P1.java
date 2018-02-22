package chapter14;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

	public class P1 extends Application {
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);//JUZHONG XIANSHI
	    pane.setHgap(100);
	    pane.setVgap(20);
	    ImageView imageView1 = new ImageView("image/uk.gif");
	    ImageView imageView2 = new ImageView("image/ca.gif");
	    ImageView imageView3 = new ImageView("image/china.gif");
	    ImageView imageView4 = new ImageView("image/us.gif");
	    pane.add(imageView1, 0, 0);
	    pane.add(imageView2, 1, 0);
	    pane.add(imageView3, 0, 1);
	    pane.add(imageView4, 1, 1);
	    
	    //Button bt = new Button("btbtbt");
	    //pane.add(bt, 5, 5);
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("MY_FIRST_JAVAFX-PRO"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  public static void main(String[] args){
			Application.launch(args);
		}

	} 