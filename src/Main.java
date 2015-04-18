import javax.swing.JFrame;

import java.awt.Color;
//Access graphics
import java.awt.Graphics;

//Access draw content
import javax.swing.JPanel;
//Access action/movement
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
//Access Keyboard
import java.awt.event.KeyListener;

//Access text editing.
import java.awt.Font; //Getting font input

public class Main extends JPanel implements ActionListener, KeyListener
{
	//Create timer for action/movement
	Timer tm = new Timer(5, this);
	//Access classes
	Player p = new Player ();
	Enemy en = new Enemy();
	
	//Screen variables
	public static int screenHeight = 1220, screenWidth = 440;
	//Booleans controlled by key pressed.
	boolean isShooting = false;
	boolean isGameStarted = false;
	
	//Class constructor
	public Main(){
		tm.start(); //start timer	
		addKeyListener(this); 
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		en.moveEnemy();
		//if(isShooting == true){
			p.w.b.moveBullet(); //Access Player, Weapon and Bullet method
		//}
		collision(); //check collison bullet/enemy
		repaint();
		
	}
	public void collision(){
		if(p.w.b.xPos == en.xPos){
			en.increaseSize();
			//respawn bullet at weapons position
			p.w.b.xPos = p.w.xPos;
		}
		if(en.isEnemyThrough == true){
			p.health-=20;
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Font font = new Font("Serif", Font.PLAIN, 30); //Create new font.
		g.setFont(font); //Passing the created font.
		if(isGameStarted == true){
			p.drawPlayer(g); //access class Players method drawPlayer
			en.drawEnemy(g);
		}
		if(isGameStarted == false){
			g.setColor(Color.ORANGE);
			g.fillRect(0,0,1300,100);
			g.setColor(Color.darkGray);
			g.drawString("<TITLE>", 100,50);
			g.fillRect(0,100,1300,400);
			g.setColor(Color.ORANGE);
			g.drawString("Game description", 100,200);
			g.drawString("Press ENTER to start!", 100,300);
		}
	}
	public void keyPressed(KeyEvent e)
	{
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_SPACE){ //Moving bullet right
			isShooting = true;
		}
		if(c == KeyEvent.VK_ENTER){ //Moving player right
			isGameStarted = true;
		}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	
	public static void displayScreen(){
		Main t = new Main();
		JFrame jf = new JFrame();
		jf.setTitle("An Unconventional Weapon"); //Displaying the title on the frame
		jf.setSize(screenHeight, screenWidth); //Setting size of frame (x,y);
		jf.setVisible(true); //Display the frame.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jf.add(t);
	}
	public static void main(String[] args) {
		displayScreen();
	}
}
