//Access graphics
import java.awt.Graphics;

public class Player extends Entity //Inherit Entity class
{ 
	//Class constructor
	public Player(){
		xPos = 20;
		yPos = 200;
	}
	
	public void drawPlayer(Graphics g){
		drawEntity(g);
		
	}

	public static void main(String[] args) {
		
	}

}
