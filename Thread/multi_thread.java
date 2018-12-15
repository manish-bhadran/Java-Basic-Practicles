package java_thread;

class NewThread1 implements Runnable
{
	String name;
	Thread t;
	NewThread1(String threadname){
		name= threadname;
		t = new Thread(this, name);
		System.out.println("New Thread " +t);
		t.start();
		
	}
	public void run()
	{
		try{
			for(int i=5; i>0;i--){
							
				System.out.println(name + ":" + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + "exiting");
		
	}
	
	
}

public class multi_thread {
	public static void main(String args[])
	{
		new NewThread1("one");
		new NewThread1("two");
		new NewThread1("three");
		
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interrupted");
			
		}
		System.out.println("Main thread exiting");
	}

}
