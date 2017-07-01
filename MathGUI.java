import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MathGUI extends JFrame
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField Question, Solution, FeedBack;
	private JCheckBox negatives;
	private MainMath math;
	public static boolean disposed = true;
	
	public MathGUI(MainMath math , String title, int boxes_size)
	{
		super(title);
		
		disposed = false;
		Handler listener = new Handler();
		this.math = math;
		super.addWindowListener(listener);
		setLayout(new FlowLayout());
		Solution = new JTextField("Enter solution here",boxes_size);
		Solution.setFont(new Font("Serene" , Font.PLAIN , 40));
		math.problem();
		Question = new JTextField(math.getDisplay() ,boxes_size);
		Question.setFont(new Font("Serene" , Font.PLAIN , 40));
		Question.setEditable(false);
		add(Question);
		FeedBack = new JTextField(boxes_size);
		FeedBack.setFont(new Font("Serene" , Font.PLAIN , 40));
		FeedBack.setEditable(false);
		add(Question);
		add(Solution);
		add(FeedBack);
		Solution.addActionListener(listener);
		if(math.negatives_optional())
		{
			negatives = new JCheckBox("allow negative numbers");
			negatives.addItemListener(listener);
			add(negatives);
		}
		
		
		
		
		
		
	}
	
	private class Handler implements ActionListener, ItemListener, WindowListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{	
			if(math.isInteger(Solution.getText()))
			{
				Integer answer = Integer.parseInt(Solution.getText());
			
				if(math.checkSolution(answer))
				{
					FeedBack.setText("Correct!");
					math.getDisplay();
				}
				else
				{
					FeedBack.setText("Incorrect! "+ math.getStringSolution() );
				}
				math.problem();
				Question.setText(math.getDisplay());
				Solution.setText("");
					
			}
			else if(math.isDouble(Solution.getText()))
			{
				double answer = Double.parseDouble(Solution.getText());
				
				if(math.checkSolution(answer))
				{
					FeedBack.setText("Correct!");
				}
				else
				{
					FeedBack.setText("Incorrect! "+ math.getStringSolution());
				}
				math.problem();
				Question.setText(math.getDisplay());
				Solution.setText("");
			}
			else
			{
				FeedBack.setText("You need to enter a proper number");
				Solution.setText("");	
			}	
		}	
		public void itemStateChanged(ItemEvent arg0) 
		{	
			if(negatives.isSelected())
				math.allowNegatives(true);
			else
				math.allowNegatives(false);		
		}

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			disposed = true;
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
