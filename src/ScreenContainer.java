import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ScreenContainer {

	
	public void startScreen(Graphics g){
		Font font = new Font("Serif", Font.PLAIN, 30); //Create new font.
		g.setFont(font); //Passing the created font.
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("<TITLE>", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.drawString("Game description", 100,200);
		g.drawString("Press ENTER to start!", 100,300);
	}
	
	public void wonGame(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("<You won. You killed people with obesity>", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.drawString("", 100,200);
		g.drawString("", 100,300);
	}
	
	public void lostGame(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("<You lost. You did not succeed in killing people with obesity!>", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.drawString("", 100,200);
		g.drawString("", 100,300);
		
	}
	public static void main(String[] args) {

	}
}
