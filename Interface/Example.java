interface I1{
	void f1();
}

interface I2{
	void f2();
}
// we can achive multiple 
interface I3 extends I1, I2 {

}

interface I4{

}

class B  implements I3, I4{
	public void f1(){

	}

	public void f2(){

	}

	public void fnb(){

	}
}
class Example extends B {
	public static void main(String []args){
		B bobj = new B();
		bobj.f1(); 
		bobj.f2();
		bobj.fnb();

		I3 iobj = new B(); // reference variable of interface I1
		iobj.f1(); 
		iobj.f2();  // variable iobj of type I1

	}
}
