import java.util.*;

public class TreeSetEx2 {

	public static void main(String []args){
		TreeSet ts = new TreeSet();
		ts.add(null); // its valid upto java version 6 
		// in v6 we can not add anything else other than null
		System.out.println("TreeSet: " + ts); 
	}
}