package fractale;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application{
	
	private Fractale fractale = new Fractale();
	private Controleur controleur = new Controleur(fractale);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Fractale_Guesdon_Desclaux");	
		Group root = new Group();
		root.getChildren().add(fractale.c);

		
		Scene scene = new Scene(root, 800, 600, Color.BLACK);
		
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){

			@Override
			public void handle(Event event) {
				System.out.println("BoutonClic");
				controleur.zoom(100);
			}
			
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main (String[] args){
		Application.launch(View.class,args); // Lance le constructeur de la classe View.		
	}

}