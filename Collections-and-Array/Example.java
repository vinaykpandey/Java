import java.util.*;
public class Example{
	public static void main(String []args){
		// int a[] = new int []{10,30,20,50,40};
		int a[] = {10,30,20,50,40};
		System.out.println(a);
		for(int i=0; i< a.length;  i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println(a);
		for(int i=0; i< a.length;  i++){
			System.out.print(a[i]+ " ");
		}
	}
}