package fractale;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Fractale {


	//le nombre d'itération
	private static int MAX_ITER=50;
	private static int ZOOM=200;
	double borneX1;
	double borneX2;
	double borneY1;
	double borneY2;

	double largeur, hauteur;
	Canvas c;

	public Fractale(){
		//L'ensemble de Mandelbrot est compris entre -2.1 et 0.6 sur l'axe des abscisses
		//											 -1.2 et 1.2 sur l'axe des ordonnées	
		 borneX1=-2.1;
		 borneX2=0.6;
		 borneY1=-1.2;
		 borneY2=1.2;

		//ZOOM, taille de la zone ou on va dessiner la fractale

		largeur=(borneX2-borneX1)*ZOOM;
		hauteur=(borneY2-borneY1)*ZOOM;
		
		c = new Canvas(largeur,hauteur);
		
		double z_r,z_i,c_r,c_i;

		//calcul
		for(int x=0;x<largeur;x++){

			for(int y=0;y<hauteur;y++){             

				z_r=0;
				z_i=0;

				c_r=(double)x/ZOOM + borneX1;
				c_i=(double)y/ZOOM + borneY1;

				double i=0;

				while(z_r*z_r + z_i*z_i < 4 && i < MAX_ITER){

					double tmp = z_r;
					z_r = z_r*z_r - z_i*z_i +c_r;
					z_i = 2*z_i*tmp +c_i;
					i = i+1;
				}
				if (i == MAX_ITER)
				{
					c.getGraphicsContext2D().setFill(Color.BLACK);
					c.getGraphicsContext2D().fillRect(x, y, 1, 1);
				}
				else{
					//dessiner avec couleur rgb(0,0, i*255/iter_max) le pixel de coord(x,y)
					Double ColorBlue = (i*255)/MAX_ITER;
					c.getGraphicsContext2D().setFill(Color.rgb(0,0,ColorBlue.intValue()));
					c.getGraphicsContext2D().fillRect(x, y, 1, 1);
				}

			}
		}
	}
	
	//Getters et Setters

	public static int getMAX_ITER() {
		return MAX_ITER;
	}

	public static void setMAX_ITER(int mAX_ITER) {
		MAX_ITER = mAX_ITER;
	}

	public static int getZOOM() {
		return ZOOM;
	}

	public static void setZOOM(int zOOM) {
		ZOOM = zOOM;
	}
	public double getBorneX1() {
		return borneX1;
	}

	public void setBorneX1(double borneX1) {
		this.borneX1 = borneX1;
	}

	public double getBorneX2() {
		return borneX2;
	}

	public void setBorneX2(double borneX2) {
		this.borneX2 = borneX2;
	}

	public double getBorneY1() {
		return borneY1;
	}

	public void setBorneY1(double borneY1) {
		this.borneY1 = borneY1;
	}

	public double getBorneY2() {
		return borneY2;
	}

	public void setBorneY2(double borneY2) {
		this.borneY2 = borneY2;
	}

}	

