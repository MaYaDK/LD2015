import javax.swing.JFrame;

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

public class Main extends JPanel implements ActionListener, KeyListener
{
	//Create timer for action/movement
	Timer tm = new Timer(5, this);
	//Access classes
	Player p = new Player ();
	Enemy en = new Enemy();
	
	//Screen variables
	public static int screenHeight = 1220, screenWidth = 440;
	
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
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		p.drawPlayer(g); //access class Players method drawPlayer
		en.drawEnemy(g);
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
