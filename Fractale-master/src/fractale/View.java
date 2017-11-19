package fractale;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application{
	
	private Fractale fractale = new Fractale();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Fractale_Guesdon_Desclaux");		
		Group root = new Group();
		root.getChildren().add(fractale.c);
		Scene scene = new Scene(root, 800, 600, Color.BLACK);
		primaryStage.setScene(scene);
		//primaryStage.setX(400);
		primaryStage.show();
		
	}

	public static void main (String[] args){
		Application.launch(View.class,args); // Lance le constructeur de la classe View.
	}

}
