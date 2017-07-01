import java.util.Random;

public class IntermediateMath extends MainMath
{
	private double x, y, solution, range;
	private String display;
	private Random random = new Random();
	boolean negatives;
	
	public IntermediateMath(int range)
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
				display = String.format("%.3f + %.3f =", x, y);
				System.out.println(display + solution);
				break;
		case 1:  if(!negatives && y>x)
				{
					double temp;
					temp = x;
					x = y;
					y = temp;
				}
				solution = x-y;
				display = String.format("%.3f - %.3f =", x, y);
				System.out.println(display + solution);
				break;
		case 2: solution = x*y;
				display = String.format("%.3f * %.3f =", x, y);
				System.out.println(display + solution);
				break;
		case 3: solution = 1 +2;
		display = String.format("%.3f + %.3f =", x, y);
		System.out.println(display + solution);
		break;
		default:if(y==0) y++;
				solution = x*y;
				double temp = x;
				x = solution;
				solution = temp;
				display = String.format("%.3f / %.3f = ", x, y);;
				System.out.println(display + solution);
				break;		
		}
	}
	public String getDisplay()
	{	
		return display;
	}
	public String getStringSolution()
	{
		String a = String.format("%.3f", solution);
		return display + " " +a;
	}
	
	public boolean checkSolution(double solution)
	{
		if(Math.abs(this.solution-solution)<0.01)
			return true;
		else
			return false;
	}
	public boolean isDouble( String input ) {
	    try {
	        Double.parseDouble( input );
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
		x = random.nextDouble() * range;
		y = random.nextDouble() * range;
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

	@Override
	public boolean checkSolution(int solution) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInteger(String input) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}