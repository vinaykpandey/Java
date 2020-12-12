import java.util.*;

public class LinkHashsetEx {
		public static void main(String []arg){
		LinkedHashSet lhs = new LinkedHashSet(); 
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("One");
		System.out.println(lhs);
		// System.out.println(lhs[0]);  this will not work
		Iterator it = lhs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}