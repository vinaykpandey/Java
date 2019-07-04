import java.util.*;
public class HashMapEx{
	public static void main(String []args){
		HashMap hm = new HashMap();
		hm.put("name", "Vinay");
		hm.put(null, null);
		hm.put(1, "abc");
		hm.put(2, "xyz");
		hm.put("name", "Vins"); // it will show
		hm.put("null", null);
		System.out.println(hm);
	}
}