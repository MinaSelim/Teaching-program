import java.io.File;
import java.util.Scanner;

public class Reader 
{
	private Scanner read;
	private File file;
	private String[] data;
	
	
	public Reader(String name, String first_line, int line_number)
	{
		file = new File(name);
		if(!file.exists())
		{
			CreateFile newfile = new CreateFile(name);
			newfile.writeToFile(first_line);
			newfile.closeFile();
			newfile = null;
		}							
		try
		{
			read = new Scanner(file);
			data = new String[line_number];
			int counter = 0;
			while(read.hasNextLine())
			{
				data[counter++] = read.nextLine();	
			}			
			read = null;
		}
		catch(Exception e)
		{
			System.out.println("could not find file");
		}
	}
		public int getMaxNumber()
		{
			
			int max_number = 12;
			BasicMath math = new BasicMath(0);
			for(int counter = 0; counter<data[0].length() ; counter++)
			{
				if(data[0].charAt(counter) == ' ')
				{
					if(math.isInteger(data[0].substring(counter+1)))
					{
						max_number = Integer.parseInt(data[0].substring(counter+1));
					}
				}
			}
			math = null;
			System.out.println("the largest number is " + max_number);
			return max_number;
		}

}
