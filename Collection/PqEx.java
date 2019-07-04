import java.util.*;
public class PqEx{
	public static void main(String []args){
		PriorityQueue pq = new PriorityQueue(); // default capacity 11

		pq.offer("A");
		pq.offer("C");
		pq.offer("D");
		pq.offer("B");

		System.out.println(pq);
		System.out.println(pq.poll()); // delete (pop) in natural orering
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}