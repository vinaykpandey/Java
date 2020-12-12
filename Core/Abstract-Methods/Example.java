abstract class A{
	abstract void show();
}
//  A is not abstract and does not override abstract method show() in A

 //B is not abstract and does not override abstract method show() in A
 class B extends A{
	void show(){
		
	}
}

// B is abstract; cannot be instantiated


class Example{
	public static void main(String []args){
		B bobj = new B();
	}
}