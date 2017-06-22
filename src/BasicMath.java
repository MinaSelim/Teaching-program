import java.util.Random;
import java.util.Scanner;
public class BasicMath 
{
	private int x, y, solution, range;
	private String display;
	private Random random = new Random();
	
	public BasicMath(int range)
	{
		this.range = range;
	}
	
	
	public static void main(String[] args)
	{		
		int answer, input;
		Scanner gam = new Scanner(System.in);
		BasicMath obj = new BasicMath(10);
		for(int i = 0; i<21; i++)
		{
			obj.problem();
			input = gam.nextInt();
			System.out.println(obj.checkSolution(input));
		}
		
	}
	
	public int problem()
	{
		int operator = random.nextInt(4);
		randomize();
		switch(operator)
		{
		case 0: solution = x+y;
				display = x + "+" + y + "= ";
				System.out.println(display);
				return solution;
		case 1: solution = x-y;
				display = x + "-" + y + "= " ;
				System.out.println(display);
				return solution;
		case 2: solution = x*y;
				display = x + "*" + y + "= ";
				System.out.println(display);
				return solution;
		default:if(y==0) y++;
				solution = x*y;
				int temp = x;
				x = solution;
				solution = temp;
				display = x + "/" + y + "= ";
				System.out.println(display);
				return solution;
		
		}
	}
	public String getDisplay()
	{
		return display;
	}
	
	public boolean checkSolution(int solution)
	{
		if(this.solution == solution)
			return true;
		else
			return false;
	}
	
	
	private void randomize()
	{
		x = random.nextInt(range + 1);
		y = random.nextInt(range + 1);
	}
}
