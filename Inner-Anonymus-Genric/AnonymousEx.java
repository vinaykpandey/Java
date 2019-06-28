class Greeting{
	public void sayHello(){
		System.out.println("Hello in Greeting  ");
	}
}

class Fcb {
	// Anonymous class: during Anonymous class creation, we create object of parent class
	Greeting gt = new Greeting(){
		public void sayHello(){
			System.out.println("Hello in Fcb  ");
		}
	}; 
}

class AnonymousEx {
	public static void main(String []args){
		Fcb fc = new Fcb();
		fc.gt.sayHello();
	}
}