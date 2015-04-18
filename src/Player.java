//Access graphics
import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity //Inherit entity class
{ 
	
	public Player(){
	}
	
	public void drawPlayer(Graphics g){
		g.setColor(Color.BLACK);
		//Head
		g.fillOval(xPos-15, yPos-25, width, height);
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
