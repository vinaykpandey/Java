import java.util.*;

public class TreeSetEx1 {

	public static void main(String []args){
		TreeSet ts = new TreeSet();
		ts.add("D");
		ts.add("A");
		ts.add("X");
		ts.add("Y");
		ts.add("B");
		ts.add("C");
		ts.add("T");
		ts.add(10);
		System.out.println("TreeSet: " + ts); // [A, B, C, D]  ( sort dictionary order )

		System.out.println("first: " + ts.first());
		System.out.println("last" + ts.last());
		System.out.println(ts.headSet("C"));
		System.out.println(ts.tailSet("B"));
		System.out.println(ts.subSet("B", "Y"));

	}
}