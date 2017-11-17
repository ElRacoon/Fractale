package fractale;

import javafx.application.*;
import javafx.stage.*;

public class fractale extends Application {


	//le nombre d'itération
	private final static int MAX_ITER=100;
	private final static int ZOOM=300;
	
	public fractale(){
		//L'ensemble de Mandelbrot est compris entre -2.1 et 0.6 sur l'axe des abscisses
		//											 -1.2 et 1.2 sur l'axe des ordonnées	
		double borneX1=-2.1;
		double borneX2=0.6;
		double borneY1=-1.2;
		double borneY2=1.2;

		//ZOOM, taille de la zone ou on va dessiner la fractale
		
		double largeur=(borneX2-borneX1)*ZOOM;
		double hauteur=(borneY2-borneY1)*ZOOM;


		double z_r,z_i,c_r,c_i;

		//calcul
		for(int x=0;x<largeur;x++){

			for(int y=0;y<hauteur;y++){             

				z_r=0;
				z_i=0;

				c_r=(double)x/(ZOOM + borneX1);
				c_i=(double)y/(ZOOM + borneY1);

				int i=0;

				while(z_r*z_r + z_i*z_i < 4 && i < MAX_ITER){
					
					double tmp = z_r;
					z_r = z_r*z_r - z_i*z_i +c_r;
					z_i = 2*z_i*tmp +c_i;
					i = i+1;
				}
				if (i == MAX_ITER)
				{
					//dessiner le pixel cerrespondant au point de coordonné (x,y)
				}
				else{
					//dessiner avec couleur rgb(0,0, i*255/iter_max) le pixel de coord(x,y)
				}

			}
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}	

