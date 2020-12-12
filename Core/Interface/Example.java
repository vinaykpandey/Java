interface I1{
	void f1();
	void f2();
}
class B  implements I1{
	public void f1(){

	}
}

class Example extends B{
	public static void main(String []args){
		B bobj = new B();
		bobj.f1(); 
	}
}
