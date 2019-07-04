import java.util.*;
class Book {
	private String title;
	private double price;
	public Book(String t, double p){
		this.title = t;
		this.price = p;
	}
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
}

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2){
		Book book1 = (Book) o1;
		Book book2 = (Book) o2;
		if(book1.getPrice() < book2.getPrice() ){
			return 1;
		}
		else{
			return -1;
		}
	}
}

public class TreeSetEx {

	public static void main(String []args){
		Book b1, b2, b3;
		b1 = new Book("Python", 300.00);
		b2 = new Book("Java", 400.00);
		b3 = new Book("Cpp", 350.00);
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);

		System.out.println("TreeSet: " + ts); 
		Book b;
		Iterator it =  ts.iterator();

		while(it.hasNext()){
			// System.out.println(it.next());
			b = (Book)it.next();
			System.out.println(b.getTitle()+" " + b.getPrice());
		}
	}
}