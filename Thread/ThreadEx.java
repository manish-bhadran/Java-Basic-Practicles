
public class ThreadEx
{ 
	public static void main(String[] args) 
	{
		
		
	}
}
class Ex implements Runnable
{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
	
	}
}
public void run1()
{
	for(int j=6;j<=10;j++)
	{
		System.out.println(j);
	}
}
}
