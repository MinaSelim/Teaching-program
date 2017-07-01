import java.util.Random;

public class BasicAlgebra extends MainMath{
	private int x, y, a, b, c, d, e, solution ,range;
	private String display;
	private Random random = new Random();
	
	
	public BasicAlgebra(int range)
	{
		this.range = range;
	}
	
	
	public void problem()
	{
		int operator = random.nextInt(6);
		randomize();
		switch(operator)
		{
		case 0: d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x);
				display = d + "(" + a +"x+" +b +"+" + c +"x)= " + solution; 
				System.out.println(display + "--->x = " +x);
				break;
		case 1: d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x);
				display =  a +"x+"  + c +"x= " + ((solution/d) - b); 
				System.out.println(display + "--->x = " +x);
				break;
		case 2: d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x);
				display =  a +"x+"  + c +"x= " + ("(" + solution + "/"+ d + ")+" + -b); 
				System.out.println(display + "--->x = " +x);
				break;
		case 3: d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x) + e;
				display = (a+c)+ "x +" +b +"= " + (solution-e)/d;
				System.out.println(display + "--->x = " +x);
				break;
		case 4: d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x) + e;
				display = d + "(" + a +"x+" +b +"+" + c +"x)+" +e + "= " + solution; 
				System.out.println(display + "--->x = " +x);
				break;
		default:d = (d==0) ? 1 : d;
				c = (a==-c) ? c++ : c;
				solution = d * (a*x + b +c*x) + e;
				display = a +"x+"+ b + " = " +(solution-e)/d + "+"+  -c+"x";
				System.out.println(display + "--->x = " +x);
				break;

		}
	}
	public String getDisplay()
	{
		
			return display;
		
	}
	public boolean checkSolution(int solution)
	{
		if(this.x == solution)
			return true;
		else
			return false;
	}
	
	
	private void randomize()
	{
		x = random.nextInt(range + 1);
		y = random.nextInt(range + 1);
		a = random.nextInt(range + 1);
		b = random.nextInt(range + 1);
		c = random.nextInt(range + 1);
		d = random.nextInt(range + 1);
		e = random.nextInt(range + 1);
		x = random.nextBoolean() ? x : -x;
		y = random.nextBoolean() ? y : -y;
		a = random.nextBoolean() ? a : -a;
		b = random.nextBoolean() ? b : -b;
		c = random.nextBoolean() ? c : -c;
		d = random.nextBoolean() ? d : -d;
		e = random.nextBoolean() ? e : -e;
	
	}
	public boolean isInteger(String input) 
	{
		 try {
		        Integer.parseInt( input );
		        return true;
		    }
		    catch( NumberFormatException e ) {
		        return false;
		    }
	}
	public String getStringSolution() 
	{
		return  display +"===>x= " + x;

	}
	public  boolean negatives_optional()
	{
		return false;
	}	



	@Override
	public void allowNegatives(boolean a) {
		
	}


	@Override
	public boolean checkSolution(double solution) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isDouble(String input) {
		// TODO Auto-generated method stub
		return false;
	}





	
}
