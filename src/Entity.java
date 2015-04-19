import java.awt.Color;
import java.awt.Graphics;


public class Entity {
	public int xPos, yPos, width, height, widthHead, heightHead, health;
	
	public Entity(){
		health = 100;
		xPos = 100;
		yPos = 100;
		width = 30; 
		height = 30;
		widthHead = 30; 
		heightHead = 30;
	}
	
	public void drawEntity(Graphics g, int xPos, int yPos){
		g.setColor(Color.BLACK);
		//Head
		g.fillOval(xPos-15, yPos-25, widthHead, heightHead);
		//Arms
		g.drawLine(xPos, yPos, xPos+20, yPos+20);
		g.drawLine(xPos, yPos, xPos-20, yPos+20);
		//Legs
		g.drawLine(xPos, yPos+50, xPos+20, yPos+50+20);
		g.drawLine(xPos, yPos+50, xPos-20, yPos+50+20);
		//Body
		g.fillOval(xPos-10,yPos, width-10, height+30);
	}

	public static void main(String[] args) {

	}
}
