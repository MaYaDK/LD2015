import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Entity {
	public int xPos, yPos, width, height, strokeSize, widthHead, heightHead, health, xPosBody, yPosBody;
	
	public Entity(){
		health = 100;
		xPos = 100;
		yPos = 100;
		width = 30; 
		height = 30;
		strokeSize = 1;
		widthHead = 30; 
		heightHead = 30;
		
	}
	
	public void drawEntity(Graphics g, int xPos, int yPos){
		g.setColor(Color.BLACK);
		//Head
		g.fillOval(xPos-15, yPos-25, width, height);
		//Arms
		//Graphics2D g2 = (Graphics2D) g;
		((Graphics2D) g).setStroke(new BasicStroke(strokeSize));
		g.drawLine(xPos, yPos, xPos+20, yPos+20);
		g.drawLine(xPos, yPos, xPos-20, yPos+20);
		//Legs
		g.drawLine(xPos, yPos+50, xPos+20, yPos+50+20);
		g.drawLine(xPos, yPos+50, xPos-20, yPos+50+20);
		//Body
		xPosBody = xPos-10;
		yPosBody = yPos;
		g.fillOval(xPosBody,yPosBody, width-10, height+30);
	}

	public static void main(String[] args) {

	}
}
