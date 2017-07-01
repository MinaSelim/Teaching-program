import java.util.Random;
public class BasicMath  extends MainMath
{
	private int x, y, solution, range;
	private String display;
	private boolean negatives;
	private Random random = new Random();
	
	public BasicMath(int range)
	{
		this.range = range;

	}

	
	public void problem()
	{
		int operator = random.nextInt(4);
		randomize();
		switch(operator)
		{
		case 0: solution = x+y;
				display = x + "+" + y + "= ";
				System.out.println(display+solution);
				break;
				
		case 1: if(!negatives && y>x)
				{
					int temp;
					temp = x;
					x = y;
					y = temp;
				}
			
				
				solution = x-y;
				display = x + "-" + y + "= " ;
				System.out.println(display+solution);
				break;
				
		case 2: solution = x*y;
				display = x + "*" + y + "= ";
				System.out.println(display+solution);
				break;
				
		default:if(y==0) y++;
				solution = x*y;
				int temp = x;
				x = solution;
				solution = temp;
				display = x + "/" + y + "= ";
				System.out.println(display+solution);
				break;
				
		
		}
	}

	public String getDisplay()
	{
		return display;
	}
	public boolean IsConvertable(String input)
	{
		  try {
		        Integer.parseInt( input );
		        return true;
		    }
		    catch( NumberFormatException e ) {
		        return false;
		    }
	}
	
	public boolean checkSolution(int solution)
	{
		if(this.solution == solution)
			return true;
		else
			return false;
	}
	public boolean isInteger( String input ) 
	{
	    try {
	        Integer.parseInt( input );
	        return true;
	    }
	    catch( NumberFormatException e ) {
	        return false;
	    }
	}
	
	public void allowNegatives(boolean a)
	{
		negatives = a;
	}
	
	private void randomize()
	{
		x = random.nextInt(range + 1);
		y = random.nextInt(range + 1);
		if(negatives)
		{
			x = random.nextBoolean() ? x : -x;
			y = random.nextBoolean() ? y : -y;
		}
	}
	public  boolean negatives_optional()
	{
		return true;
	}	

	public String getStringSolution() {
		return display + " " + solution;
	}



	@Override
	public boolean isDouble(String input) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean checkSolution(double solution) {
		// TODO Auto-generated method stub
		return false;
	}


	



	


	
	
}
