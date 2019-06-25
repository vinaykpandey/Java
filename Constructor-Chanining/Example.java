class A{
	public A(){
		// super();
		System.out.println("A1");
	}
}
class B  extends  A {
	public B(){
		// super();
		this(4); 
		//  this represent current constructor.  we can use super or this (only one)
		System.out.println("B1");
	}
	public B(int k){
		// super called here
		System.out.println("B1k: "+ k);
	}
}

class Example{
	public static void main(String []args){
		B obj = new B();
	}
}