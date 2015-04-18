import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	public int speed = 3;
	
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
	public void increaseSize(){
		//xPos = xPos - 30;
		width = width+10; 
		height = height+10;
		speed = speed -1;
	}

	public static void main(String[] args) {

	}
}
