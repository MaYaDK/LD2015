import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	//Class constructor
	public Enemy(){
		xPos = 400;
		yPos = 200;
	}
	
	public void drawEnemy(Graphics g){
		drawEntity(g);
	}

	public static void main(String[] args) {

	}

}
