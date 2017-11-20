package fractale;

public class Controleur {

	
	
	Fractale f = new Fractale();
	
	public Controleur(Fractale f){
		this.f = f;		    
	}
	
	public void zoom(int delta){
		
		if (delta > 0)
		{
			f.setZOOM(f.getZOOM()+delta);
			//f.update();
		}
		else
		{
			//bah on diminue sa mère du coup !!!!
		}
	}
}
