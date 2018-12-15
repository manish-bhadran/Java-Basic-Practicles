class Box{
	double width;
	double height;
	double depth;
	int a;
	Box(){
		width = 10;
		height = 20;
		depth = 30;
		a=5;
	}
	Box(double w, double h, double d){
		width= w;
		height = h;
		depth = d;
	}
	double volume(){
		return height*depth*height;

	}
	void this_keyword(){
		int a=10;
		System.out.println("this Keyword Usage");
		System.out.println("Local variable a is "+a );
		System.out.println("Instance variable a value is "+this.a);
	}
}

class First_Program{
	public static void main(String[] args) {
		double vol;
		double width = 20;
		Box mybox1 = new Box();
		Box mybox2 = new Box(5,10,2);
		vol= mybox1.volume();
		System.out.println("Volume of First Box is "+vol);
		vol = mybox2.volume();
		System.out.println("Volume of Second Box is "+vol);
		mybox1.this_keyword();
		
	}
}