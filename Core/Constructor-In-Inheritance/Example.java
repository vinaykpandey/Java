class A{
	int a;
	public A(int x){
		System.out.println("A: "+ x);
	}
}

class B extends A{
	int b;
	public B(){
		//call to super must be first statement in constructor
		// its alreay handled in case in constructor
		super(10); 
		System.out.println("B");
	}
}

class Example{
	public static void main(String []args){
		B obj = new B();
	}
}