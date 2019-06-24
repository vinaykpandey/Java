class A{
	public void f1(int x){
		System.out.println("Class A");
	}
	
}

class B extends A{
	// overide parent class  function
	public void f1(int x){
		System.out.println("Class B");
	}
}
public class Overriding{
	public static void main(String []args){
		B obj = new B();
		obj.f1(1); // from class B
	}
}