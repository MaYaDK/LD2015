import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	public int speed = 3;
	boolean isDead = false;
	boolean isEnemyThrough = false;
	
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
		if(isDead == true || isEnemyThrough == true){
			//reset enemy
			xPos = 1200;
			yPos = 200;
			health = 100;
			width = 30;
			height = 30;
			speed = 3;
			drawEntity(g);
			isDead = false;
			isEnemyThrough = false;
		}
	}
	public void moveEnemy(){
		if(isDead == false){
			xPos = xPos - speed;
			//if enemy reached end of screen/player
			if(xPos<=0){
				isEnemyThrough = true;
				
			}
		}
	}
	public void increaseSize(){
		width = width+10; 
		height = height+10;
		speed = speed -1;
		health = health -50;
		if(health<=0){
			isDead = true;
		}
	}

	public static void main(String[] args) {

	}
}
