import java.awt.Graphics;

public class Enemy extends Entity //Inherit Entity class
{
	public int speed = 3;
	public int numberOfKilled = 0;
	boolean isDead = false;
	boolean isEnemyThrough = false;
	
	//Class constructor
	public Enemy(){
		xPos = 1200;
		yPos = 330;
		health = 100;
	}
	
	public void drawEnemy(Graphics g){
		drawEntity(g, xPos, yPos);
		if(isDead == true || isEnemyThrough == true){
			//reset enemy
			xPos = 1200;
			yPos = 330;
			health = 100;
			width = 30;
			height = 30;
			speed = 3;
			strokeSize = 1;
			isDead = false;
			isEnemyThrough = false;
		}
	}
	public void moveEnemy(){
		if(isDead == false){
			xPos = xPos - speed;
			//if enemy reached end of screen/player
			if(xPos<=30){
				isEnemyThrough = true;
				
			}
		}
	}
	public void increaseSize(){
		width = width+20; 
		height = height+10;
		speed = speed -1;
		health = health -25;
		strokeSize = strokeSize+5;
		if(health<=0){
			isDead = true;
			numberOfKilled +=1;
		}
	}

	public static void main(String[] args) {

	}
}
