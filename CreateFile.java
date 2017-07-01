import java.util.Formatter;

public class CreateFile
	{
		private Formatter test1;
		public CreateFile(String a)
		{
			try
			{
				test1 = new Formatter(a);
				System.out.println("you created a "+ a+" file");
			}
			catch(Exception e)
			{
				System.out.println("error, file not created");
			}
		}
		public void writeToFile(String a)
		{
			test1.format("%s%n", a);
			
		}
		public void closeFile()
		{
			test1.close();
		}
	


	}