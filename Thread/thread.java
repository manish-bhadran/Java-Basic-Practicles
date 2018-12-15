package pasha;

class th1 implements Runnable {
public void run(){
System.out.println("Printing from 1 to 100");
for(int i=1; i<100; i++){
if(i%6==0 && (i%4)!=0)
{
System.out.println(i);
}
}
}
}

class th2 implements Runnable {
public void run(){
System.out.println("Printing from 101 to 200");
for(int i=101; i<200; i++){
if(i%6==0 && (i%4)!=0)
{
System.out.println(i);
}
}
}
}

public class thread {
	
public static void main(String[] args) throws Exception{
	
	th1 ob1 = new th1();
	th2 ob2 = new th2();

	Thread t1 = new Thread(ob1);
	Thread t2 = new Thread(ob2);
	
t1.start();

try
{
	t1.join();
}

catch(Exception e)
{
System.out.println(e);
}

t2.start();
try 
{
	t2.join();
}

catch(Exception e)
{
System.out.println(e);
}

}
}
