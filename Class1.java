package java_project1;
import java.util.Scanner;

class employee{
	String ename;
	int eno;
	int sal;
	int netsal;
	void setdata(){
		
		Scanner un = new Scanner (System.in);
		System.out.println("Enter Employee Name: ");
		ename= un.next();
		Scanner no = new Scanner (System.in);
		System.out.println("Enter Employee No.: ");
		eno= no.nextInt();
		Scanner sal1 = new Scanner (System.in);
		System.out.println("Enter Salary.: ");
		sal= sal1.nextInt();
	}
	
	void display(){
		System.out.println("Enter Employee ID: " +eno);
		System.out.println("Enter Employee Name: " +ename);
		System.out.println("Net Salary is: " +netsal);
		
	}
	
}

class marketing extends employee{
	//da 12%  , pf 14%
	int da;
	int hra=8;
	int pf;

	void calc(){
		System.out.println("Calculating Net Salary for Marketing Department Employee ");
		da= (sal*12)/100;
		pf= (sal*14)/100;
		netsal = sal+da+hra-pf;
	
		
	}
	
	
}
class finance extends employee{
	//da 10%  , pf 18%
	int da;
	int hra=6;
	int pf;
	
	void calc(){
		System.out.println("Calculating Net Salary for Finance Department Employee ");
		da= (sal*10)/100;
		pf= (sal*18)/100;
		netsal = sal+da+hra-pf;

	}

}
class production extends employee{
	//da 14%  , pf 12%

	int da;
	int hra=7;
	int pf;
	
	void calc(){
		System.out.println("Calculating Net Salary for production Department Employee ");
		da= (sal*14)/100;
		pf= (sal*12)/100;
		netsal = sal+da+hra-pf;

	
}
}
public class Class1 {
	public static void main(String args[]){
		
		marketing m = new marketing();
		finance f = new finance();
		production p = new production();
		m.setdata();
		f.setdata();
		p.setdata();
		f.calc();
		m.calc();
		p.calc();
		m.display();
		f.display();
		p.display();
		
	}

}
