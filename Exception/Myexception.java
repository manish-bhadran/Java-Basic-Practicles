class Ex extends Exception
{
	private int detail;
	Ex(int a)
	{
		detail=a;
	}
		
		public String toString()
		{
			return "Ex[" + detail + "]";
		}
	
}
public class Myexception 
{
	
	static void compute(int a) throws Ex 
		{
			System.out.println("Called Compute" + (a));
			if(a>10)
				throw  new Ex(a);
			System.out.println("Normal Exit");
		}
		public static void main(String[] args)
		{
			try
			{
				compute(1);
				compute(20);
			}
			catch(Ex e)
			{
				System.out.println("MyException " +e );
			}
		}

}
