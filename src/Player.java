//Access graphics
import java.awt.Graphics;

public class Player extends Entity //Inherit Entity class
{ 
	Weapon w = new Weapon();
	//Class constructor
	public Player(){
		xPos = 20;
		yPos = 200;
	}
	
	public void drawPlayer(Graphics g){
		w.drawWeapon(g);
		drawEntity(g);
		g.drawString("Health: "+health, 100, 300);
	}

	public static void main(String[] args) {
		
	}

}
