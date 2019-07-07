import java.util.*;
public class Example1{
	public static void main(String []args){
		Vector v = new Vector();
		v.add(20);
		v.add(50);
		v.add(10);
		v.add(30);
		System.out.println(v);
		Collections.sort(v); // Collections class have sort  static method
		System.out.println(v);
	}
}