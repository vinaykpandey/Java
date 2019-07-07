import java.util.*;
public class Example{
	public static void main(String []args){
		Vector v = new Vector();
		v.add(20);
		v.add(50);
		v.add(10);
		v.add(30);
		System.out.println(v);
		Collections.sort(v);
		int x = Collections.binarySearch(v, 30); 
		// binarySearch is always work for sorted list
		System.out.println(v);
		System.out.println(x);
	}
}