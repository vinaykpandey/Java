class A{
	public void f1(int x){
		System.out.println("Class A");
	}
	
}

class B extends A{
	
	public void f1(int x, int y){
		System.out.println("Class B");
	}
}
// this is function hiding in cpp
public class Overlading{
	public static void main(String []args){
		B obj = new B();
		obj.f1(1); // from class A
		obj.f1(1,2); //  from class B
	}
}