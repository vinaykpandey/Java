import java.util.*;

class ExLinkList{
	public static void main(String []arg){
		LinkedList ll = new LinkedList();
		ll.addFirst("Vinay");
		ll.addLast("Pandey");
		ll.add(1, "Index 1");

		System.out.println(ll.getFirst());
		System.out.println(ll.get(1));
		System.out.println(ll.getLast());
	}
}