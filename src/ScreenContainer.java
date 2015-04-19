import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ScreenContainer {
	private int fontSize =30;

	
	public void startScreen(Graphics g){
		Font font = new Font("Serif", Font.PLAIN, 38); //Create new font.
		Font font2 = new Font("Serif", Font.PLAIN, 24); //Create new font.
		g.setFont(font); //Passing the created font.
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("DEATH BY SUGAR", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.setFont(font2); //Passing the created font.
		g.drawString("Todays most common disease is obesity, so why not use this as a weapon?", 100,250);
		g.drawString("Shoot your enemies with sugar, so they get more and more fat and slow until "
				+ "they can't move and die..", 100,300);
		g.drawString("Shoot with SPACE, move upwards with UP and move downwards with DOWN.", 100,350);
		g.setFont(font); //Passing the created font.
		g.drawString("Press ENTER to start!", 100,500);
		g.setFont(font2); //Passing the created font.
		g.drawString("Created by: Maja Daniela Hansen", 860,580);
	}
	
	public void wonGame(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("Congratulation! You killed a lot of people with obesity", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.drawString("", 100,200);
		g.drawString("", 100,300);
	}
	
	public void lostGame(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(0,0,1300,100);
		g.setColor(Color.darkGray);
		g.drawString("Well you probably killed a few.. but died trying", 100,50);
		g.fillRect(0,100,1300,600);
		g.setColor(Color.ORANGE);
		g.drawString("", 100,200);
		g.drawString("", 100,300);
		
	}
	public static void main(String[] args) {

	}
}
