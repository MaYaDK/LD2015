//Access graphics
import java.awt.Graphics;

public class Player extends Entity //Inherit Entity class
{ 
	Weapon w = new Weapon();
	//Class constructor
	public Player(){
		xPos = 20;
		yPos = 330;
		w.xPos = xPos+10;
		w.yPos = yPos+20;
		w.b.xPos = xPos+10;
		w.b.yPos = yPos+20;
	}
	
	public void drawPlayer(Graphics g){
		w.drawWeapon(g);
		drawEntity(g, xPos, yPos);
		g.drawString("Health: "+health, 100, 300);
	}

	public static void main(String[] args) {
		
	}

}
