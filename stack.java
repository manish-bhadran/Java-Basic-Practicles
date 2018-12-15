import java.util.*;
import java.io.*;
class Global{
	public static int top=0;
	public static int stk[];
	public static int MAX=5;
}
interface stackpro{
	void push();
	void pop();
	void display();
}

class Myclass implements stackpro{
	public void push()
	{
		if(Global.top==(Global.MAX-1))
		{
			System.out.println("Stack is Full");
		}
		else{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the elment: ");
			Global.stk[Global.top] = in.nextInt();
			System.out.println("Element entered Succeffuly ");
			Global.top++;

		}
		
	}
	public void pop(){
		if(Global.top==0)
		{
			System.out.println("Stack is empty");
		}
		else
			{
				System.out.println("Elements is deleted Succeffuly from Stack "+Global.stk[Global.top]);
				Global.top--;

			}
	}
	public void display()
	{
		if(Global.top==0)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			for(int i=0; i<=Global.top; i++)
			{
				System.out.println(Global.stk[i]);
			}
		}
	}

}
class stack{
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		int ch=0;
		boolean var= true;
		while(var)
		{
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. DISPLAY");
			System.out.println("4. EXIT");
			System.out.println("Enter your choice: ");
			ch = in.nextInt();
		
		Myclass obj = new Myclass();
		switch(ch){
			case 1: obj.push();
			break;
			case 2: obj.pop();
			break;
			case 3: obj.display();
			break;
			case 4: System.exit(0);
			break;
			default: System.out.println("Invalid Choice");

		}
		}
		
		
		
	}
}