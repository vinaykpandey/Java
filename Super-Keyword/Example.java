class A{
	int x;
	public void f1(){
		
	}
}


class B extends A{
	int y;
	int z; //  step 2
	public void f1(){
		/*
		it have 2 ref: this, refer (its kind of local variable)
		this and super both referring to current object (caller object)
		*/
		super.f1(); // call parent function
	}

	public void f2(){
		int z;
		z = 2;
		this.z = 4;  // access step 2 instance variable
		y = 3;
		super.x =4; // instance variable inside class A
	}
}

class Example{
	public static void main(String []args){
		B obj = new B();
		obj.f1();
		obj.f2();
	}
}