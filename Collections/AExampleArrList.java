import java.util.*;

class AExampleArrList{
	public static void main(String []arg){
		ArrayList al = new ArrayList(5);
		al.add("Vinay");
		al.add("Pandey");
		al.add("Python");
		al.add("Java");
		al.add(3, "cpp");
		// iterator class 
		Iterator it = al.iterator();
		int i = 0;
		while(it.hasNext()){
			i += 1;
			// System.out.println(i);
			System.out.println(it.next());
		}
	}
}