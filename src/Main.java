import javax.swing.JFrame;
//Access graphics
import java.awt.Graphics;
//Access draw content
import javax.swing.JPanel;


public class Main extends JPanel{
	//Access classes
	Player p = new Player ();
	Enemy e = new Enemy();
	//Screen variables
	public static int screenHeight = 1220, screenWidth = 440;
	

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		p.drawPlayer(g); //access class Players method drawPlayer
		e.drawEnemy(g);
	}
	
	
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
