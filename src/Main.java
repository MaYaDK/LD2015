import javax.swing.JFrame;


public class Main {
	public static int screenHeight = 1220, screenWidth = 440;

	public static void displayScreen(){
		Main t = new Main();
		JFrame jf = new JFrame();
		jf.setTitle("An Unconventional Weapon"); //Displaying the title on the frame
		jf.setSize(screenHeight, screenWidth); //Setting size of frame (x,y);
		jf.setVisible(true); //Display the frame.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String[] args) {
		displayScreen();
	}
}
