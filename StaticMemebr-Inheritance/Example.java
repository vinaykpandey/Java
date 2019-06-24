class Parent{
	
	static int y = 4;
	public static void f1(){
		System.out.println("Parent Class");
	}
}

class Child extends Parent {

	static
	{
		y = 5;  // static member variable not inherited
	}
	// public static void f1(){
	// 	System.out.println("Child Class");
	// }
}

class Example{
	public static void main(String []args){
		Child.f1(); 
		// if f1 not defined inside Child it will call parent, if exist it will hide
		System.out.println("y: "+ Child.y);
	}
}