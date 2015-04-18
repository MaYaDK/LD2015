import java.awt.Graphics;


public class Bullet 
{
	private int xPos, yPos, speed = 1;

	//Class constructor
		public Bullet(){
			xPos = 100;
			yPos = 200;
		}
		
		public void drawBullet(Graphics g){
			g.fillRect(xPos,yPos,5,5); //Temporary
		}
		public void moveBullet(){
			//Increase x value/move one to the right.
			xPos = xPos + speed;
		}
	public static void main(String[] args) {

	}
}
