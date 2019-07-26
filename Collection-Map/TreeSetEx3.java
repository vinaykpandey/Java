import java.util.*;

public class TreeSetEx {

	public static void main(String []args){
		TreeSet ts = new TreeSet();
		//ts.add(null); // make no sense so its not allowed after java v6

		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("D"));
		ts.add(new StringBuffer("C"));
		ts.add(new StringBuffer("A"));
		System.out.println("TreeSet: " + ts); 
	}
}