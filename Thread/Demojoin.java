class NewT implements Runnable
{
	String name;
	Thread t;
	
	NewT(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New thread: "+t );
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + ":"+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "interrupted ");
		}
		System.out.println(name + " exiting ");
	}
}

public class Demojoin {

	public static void main(String[] args)
	{
		NewT ob1=new NewT("One");
		NewT ob2=new NewT("Two");
		NewT ob3=new NewT("Three");
		
		System.out.println("Thread one is alive :" + ob1.t.isAlive());
		System.out.println("Thread two is alive :" + ob2.t.isAlive());
		System.out.println("Thread three is alive :" + ob3.t.isAlive());
		
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread one is alive : "+ob1.t.isAlive());
		System.out.println("Thread two is alive : "+ob2.t.isAlive());
		System.out.println("Thread one is alive : "+ob1.t.isAlive());
		
		System.out.println("Main thread exiting");
		
	}

}
