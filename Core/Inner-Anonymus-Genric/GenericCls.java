//Generic class: when we create object data type will define
class MyData <T> {
	T i ;
	public void add(T i1){
		i = i1;
	}

	public T get(){
		return i;
	}
}

public class GenericCls{
	public static void main(String []args){
	// 	MyData md = new MyData();
	// 	Integer k = new Integer(20);
	// 	md.add(10);
	// 	System.out.println(md.get());
	// 	md.add(k);
	// 	System.out.println(md.get());
		/*
		int / Integer
		Note: GenericClass.java uses or overrides a deprecated API.
		Note: Recompile with -Xlint:deprecation for details
		*/

		MyData <Integer> m1 = new MyData<Integer>();
		MyData <String> m2 = new MyData<String>();
		Integer k = new Integer(20);
		m1.add(k);
		m2.add("Vinay");
		System.out.println("m1: " +m1.get());
		System.out.println("m2: " +m2.get());
	}
}