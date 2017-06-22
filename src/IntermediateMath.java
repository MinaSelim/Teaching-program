import java.util.Random;
import java.util.Scanner;

public class IntermediateMath {
	private double x, y, solution, range;
	private String display;
	private Random random = new Random();
	
	public IntermediateMath(int range)
	{
		this.range = range;
	}
	
	
	public static void main(String[] args)
	{		
		double answer, input;
		Scanner gam = new Scanner(System.in);
		IntermediateMath obj = new IntermediateMath(10);
		for(int i = 0; i<21; i++)
		{
			System.out.println(obj.problem());
			input = gam.nextDouble();
			System.out.println(obj.checkSolution(input));
		}
		
	}
	
	public double problem()
	{
		int operator = random.nextInt(4);
		randomize();
		switch(operator)
		{
		case 0: solution = x+y;
				display = String.format("%.3f + %.3f =", x, y);
				System.out.println(display);
				return solution;
		case 1: solution = x-y;
				display = String.format("%.3f - %.3f =", x, y);
				System.out.println(display);
				return solution;
		case 2: solution = x*y;
				display = String.format("%.3f * %.3f =", x, y);
				System.out.println(display);
				return solution;
		default:if(y==0) y++;
				solution = x*y;
				double temp = x;
				x = solution;
				solution = temp;
				display = String.format("%.3f / %.3f = ", x, y);;
				System.out.println(display);
				return solution;
		
		}
	}
	public String getDisplay()
	{	
		return display;
	}
	
	public boolean checkSolution(double solution)
	{
		if(Math.abs(this.solution-solution)<0.01)
			return true;
		else
			return false;
	}
	
	
	private void randomize()
	{
		x = random.nextDouble() * range;
		y = random.nextDouble() * range;
	}
}