class Mye extends Exception
{
	int a,b;
	
	Mye(int c,int d)
	{
		a=c;
		b=d;
	}
	
    public String toString()
	{
		return  " Mye[" + a +" " +  b + "]";
	}
}
public class Demo 
{
    static void cal(int a,int b) throws Mye
    {
    	int c=a+b;
    	if(c>20)
    	{
    		throw new Mye(a, b);
    	}
    }
	public static void main(String[] args)
	{
		try
		{
			cal(5,3);
			cal(11,10);
		}
		catch(Mye e)
		{
			System.out.println("Exception" +e);
		}

	}

}
