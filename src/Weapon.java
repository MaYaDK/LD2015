import java.awt.Graphics;


public class Weapon 
{
	Bullet b = new Bullet();
	public int xPos, yPos;
	
	//Class constructor
	public Weapon(){
		xPos = 30;
		yPos = 220;
	}
			
	public void drawWeapon(Graphics g){
		g.fillRect(xPos,yPos,15,5); //Temporary
		b.drawBullet(g);
	}

	public static void main(String[] args) {
		
	}
}
