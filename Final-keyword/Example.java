/*
this class is final
we can not extends this
*/
final class Dummy{

}

class Abc{
	public final void fn(){

	}
}

class xyz extends Abc{
		// we can not override method fn
}

public class Example{
	//(instance or instance member)
	private int x; // instance memebr variable  (default value contains)
	private final int y; // final instance varibale (its hold blank)
	private static int z; // static variable or static member variable
	private final static int w;

	{
		// y = 10; // initialization of final instance variable
	}
	static
	{
		w = 30;
	}
	// constructor
	Example(){
		y = 20 ;
	}

	public void fun(){
		int k; // local variables are by default blank ( we can change the valu of k)
		final int m; // final local variable (by default its blank, initialize only once )
	}
	public static void main(String []args){
		Example ex = new Example();
	}
}