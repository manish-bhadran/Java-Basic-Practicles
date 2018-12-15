class final1{
	public static void main(String[] args){
		final1 m = new final1();
	m.finalize();
	m.finalize();
	m=null;

	System.gc();
	System.out.println("Main Completes");
	}

	public void finalize(){
		System.out.println("Finalize Called");
	

	}
	
}