import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	public int speed = 3;
	boolean isDead = false;
	
	//Class constructor
	public Enemy(){
		xPos = 1200;
		yPos = 200;
		health = 100;
	}
	
	public void drawEnemy(Graphics g){
		
		if(isDead == false){
			drawEntity(g);
		}
		if(isDead == true){
			//reset enemy
			xPos = 1200;
			yPos = 200;
			health = 100;
			width = 30;
			height = 30;
			speed = 3;
			drawEntity(g);
			isDead = false;
		}
	}
	public void moveEnemy(){
		if(isDead == false){
			xPos = xPos - speed;
		}
	}
	public void increaseSize(){
		width = width+10; 
		height = height+10;
		speed = speed -1;
		health = health -50;
		if(health <=0){
			isDead = true;
		}
	}

	public static void main(String[] args) {

	}
}
