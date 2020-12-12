public class Test{
	private int x;
	private static int k;
	/*Instance initialization block: execute when we create object of the class*/
	{
		System.out.println("Instance initialization block 1, x=  "+ x);
		x = 5;	
	}

	static
	{
		System.out.println("static initialization block 1, k=  "+ k);
		k = 10;	
	}
	public Test(){
		System.out.println("Constructor: x= "+x);
	}

	{
		System.out.println("Instance initialization block 2, x=  "+ x);
		x = 5;	
	}



	public static void main(String []args){
		Test t_1 =  new Test();
		Test t_2 =  new Test();
	}

}