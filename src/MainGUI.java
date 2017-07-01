import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class MainGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton  BasicMath, IntermediateMath, BasicAlgebra;
	private JLabel creator;
	private int max_number;
	private Reader config = new Reader("Config.txt" , "LargestNumber: 12" , 1);
	
	public MainGUI()
	{
		
		super("Teaching program");
		Handler listener = new Handler();
		max_number = config.getMaxNumber();
		setLayout(new FlowLayout());
		BasicMath = new JButton("       Basic Math questions      ");
		BasicMath.setToolTipText("Basic operations using whole numbers");
		add(BasicMath);
		BasicMath.addActionListener(listener);
		IntermediateMath = new JButton("Intermediate Math questions");
		IntermediateMath.setToolTipText("Basic operations using fractional numbers");
		add(IntermediateMath);
		IntermediateMath.addActionListener(listener);
		BasicAlgebra = new JButton("    Basic Algebra questions    ");
		BasicAlgebra.setToolTipText("Basic questions to find the value of x");
		add(BasicAlgebra);
		BasicAlgebra.addActionListener(listener);
		creator = new JLabel("Made by Mina Selim");
		add(creator);
		}
	
	private class Handler implements ActionListener
	{		
		public void actionPerformed(ActionEvent action) 
		{		
			if(BasicMath == action.getSource()&& MathGUI.disposed)
			{				
				MathGUI BMGui = new MathGUI(new BasicMath(max_number) , "basic questions" ,19);
				BMGui.setResizable(false);
				BMGui.setSize(690 , 270);
				BMGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				BMGui.setVisible(true);
			}
			if(IntermediateMath == action.getSource()&& MathGUI.disposed)
			{
				MathGUI IMGui = new MathGUI(new IntermediateMath(max_number) , "Intermediate questions" , 19);
				IMGui.setResizable(false);
				IMGui.setSize(700, 280);	
				IMGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				IMGui.setVisible(true);
			}
			if(BasicAlgebra == action.getSource()&& MathGUI.disposed)
			{
				MathGUI BAGui = new MathGUI(new BasicAlgebra(max_number) , "Basic Algebra" ,28);
				BAGui.setResizable(false);
				BAGui.setSize(1000, 250);	
				BAGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				BAGui.setVisible(true);
			}			
		}
	}
}
