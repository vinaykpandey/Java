abstract class Person{
	private String name;
	private int age;
	Person(){
		System.out.println("Abstarct class");
	}
}

class Child extends Person{

}



class Example extends Person{
	public static void main(String []args){
		Person obj = new Child();
	}
}

// class Example extends Person{
// 	public static void main(String []args){
// 		// Person pr = new Person(); // Person is abstract; cannot be instantiated
// 		Example ex = new Example();
// 	}
// }