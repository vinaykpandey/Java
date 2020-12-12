import java.util.*;

public class IterEx{
	public static void main(String args[]){
		ArrayList al = new ArrayList(); // default capacity is 10 
		for (int i=1; i<=10; i++){
			al.add(i);
		}
		System.out.println(al);
		// System.exit(0);
		Iterator it = al.iterator();
		while(it.hasNext()){
			Integer itg =  (Integer)it.next();
			if(itg > 3 &&  itg < 8){
				it.remove();
			}
			// System.out.println(itg);

		}
		System.out.println(al);
	}
}