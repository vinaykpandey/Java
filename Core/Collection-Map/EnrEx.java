import java.util.*;

public class EnrEx{
	public static void main(String args[]){
		Vector v = new Vector(); // default capacity of vector is 10
		v.addElement("One");
		v.addElement("Two");
		v.addElement("Three");
		System.out.println(v);
		Iterator it = v.iterator();
		int i = 0;
		while(it.hasNext()){
			i += 1;
			// System.out.println(i);
			System.out.println(it.next());
		}

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			String s = (String)e.nextElement();
			System.out.println(s + " , length: " + s.length() );
		}
	}
}