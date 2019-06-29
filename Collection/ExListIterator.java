import java.util.*;

public class ExListIterator{
	public static void main(String args[]){
		LinkedList ll =  new LinkedList();
		ll.add("CPP");
		ll.add("Java");
		ll.add("Python");


		System.out.println(ll);

		ListIterator li = ll.listIterator();
		
		while(li.hasNext()){
			String s = (String)li.next();
			if(s.equals("Java")){
				li.set("Java SE");
			}
			else if (s.equals("CPP")){
				li.add("DSA");
			}
			System.out.println(s);
		}

		System.out.println(ll);

		while(li.hasNext()){
			System.out.println("hiiiii");
			String s = (String)li.next();
			if(s.equals("Java")){
				li.set("Java SE");
			}
			else if (s.equals("CPP")){
				li.add("DSA");
			}
			System.out.println(s);
		}
	}
}