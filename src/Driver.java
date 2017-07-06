import javax.swing.JFrame;

public class Driver
{
	public static void main(String[] args) 
	{
		
		MainGUI Gui = new MainGUI();
		Gui.setResizable(false);
		Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gui.setSize(280 , 700);
		Gui.setLocationRelativeTo(null);
		Gui.setVisible(true);
		
	}
}
