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
	EnemyTop enT = new EnemyTop();
	EnemyBottom enB = new EnemyBottom();
	ScreenContainer s = new ScreenContainer();
	
	//Screen variables
	public static int screenWidth = 1220, screenHeight = 650;
	
	//Booleans controlled by key pressed.
	boolean isShooting = false;
	boolean isGameStarted = false;
	boolean isGameWon = false;
	boolean isGameLost = false;
	public int numberOfEnemies;

	
	//Class constructor
	public Main(){
		numberOfEnemies = 1;
		tm.start(); //start timer	
		addKeyListener(this); 
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(isGameStarted == true){
			en.moveEnemy();
			enT.moveEnemy();
			enB.moveEnemy();
			collision(); //check collison bullet/enemy
		if(isShooting == true){
			p.w.b.moveBullet(); //Access Player, Weapon and Bullet method
		}
		repaint();
		}
	}
	
	public void collision(){
		if(p.w.b.xPos >= enT.xPos && p.w.b.yPos > 0 && p.w.b.yPos < 200){
			enT.increaseSize();
			//respawn bullet at weapons position
			p.w.b.xPos = p.xPos;
			//Count killed people
			isShooting = false;
		}
		if(p.w.b.xPos >= en.xPos && p.w.b.yPos > 200 && p.w.b.yPos < 400){
			en.increaseSize();
			//respawn bullet at weapons position
			p.w.b.xPos = p.xPos;
			//Count killed people
			isShooting = false;
		}
		if(p.w.b.xPos >= enB.xPos && p.w.b.yPos >400){
			enB.increaseSize();
			//respawn bullet at weapons position
			p.w.b.xPos = p.xPos;
			//Count killed people
			isShooting = false;
		}
		if(enT.isEnemyThrough||en.isEnemyThrough == true || enB.isEnemyThrough){
			p.health-=20;
		}
		if(p.health<=0){
			isGameLost = true;
		}
		if(enT.numberOfKilled + en.numberOfKilled + enB.numberOfKilled == 5){
			isGameWon = true;
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Font font = new Font("Serif", Font.PLAIN, 30); //Create new font.
		g.setFont(font); //Passing the created font.
		
		if(isGameStarted == true){
			for(int i = 0; i<=screenHeight; i+=200){
				g.drawLine(0,i,screenWidth, i);
				g.drawRect(0,i,200,200);
			}
			
			//Background
			for(int i = 0; i<=screenWidth; i+=200){
				g.setColor(Color.DARK_GRAY);
				g.fillRect(i,0,200,200);
				
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(i+10,10,180,180);
			}
			for(int i = 0; i<=screenWidth; i+=200){
				g.setColor(Color.DARK_GRAY);
				g.fillRect(i,200,200,200);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(i+10,210,180,180);
			}
			for(int i = 0; i<=screenWidth; i+=200){
				g.setColor(Color.DARK_GRAY);
				g.fillRect(i,400,200,200);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(i+10,410,180,180);
			}
			//Objects
			en.drawEnemy(g);
			enT.drawEnemy(g);
			enB.drawEnemy(g);
			p.drawPlayer(g); //access class Players method drawPlayer
		}
		if(isGameStarted == false){
			s.startScreen(g);
		}
		if(isGameLost == true){
			s.lostGame(g);
		}
		if(isGameWon == true){
			s.wonGame(g);
		}
	}
	public void keyPressed(KeyEvent e)
	{
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_SPACE){ //Moving bullet right
			isShooting = true;
			
		}
		if(c == KeyEvent.VK_E){ //Moving bullet right
			//en[numberOfEnemies] = new Enemy();
		}
		if(c == KeyEvent.VK_ENTER){ //Moving player right
			isGameStarted = true;
		}
		if(c == KeyEvent.VK_UP){ //Moving player right
			if(p.yPos>200){
				p.yPos -=200;
				p.w.yPos -=200;
				if(isShooting == false){
					p.w.b.yPos = p.w.yPos;
				}
				if(isShooting == true){
					p.w.b.yPos = p.w.b.yPos;
				}
			}
		}
		if(c == KeyEvent.VK_DOWN){ //Moving player right
			if(p.yPos<400){
				p.yPos +=200;
				p.w.yPos +=200;
				if(isShooting == false){
					p.w.b.yPos = p.w.yPos;
				}
				if(isShooting == true){
					p.w.b.yPos = p.w.b.yPos;
				}
			}
		}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	
	public static void displayScreen(){
		Main t = new Main();
		JFrame jf = new JFrame();
		jf.setTitle("An Unconventional Weapon"); //Displaying the title on the frame
		jf.setSize(screenWidth, screenHeight); //Setting size of frame (x,y);
		jf.setVisible(true); //Display the frame.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jf.add(t);
	}
	public static void main(String[] args) {
		
		displayScreen();
	}
}
