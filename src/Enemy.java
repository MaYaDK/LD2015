import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	public int speed = 1;
	
	//Class constructor
	public Enemy(){
		xPos = 1200;
		yPos = 200;
	}
	
	public void drawEnemy(Graphics g){
		drawEntity(g);
	}
	public void moveEnemy(){
		xPos = xPos - speed;
	}

	public static void main(String[] args) {

	}
}
