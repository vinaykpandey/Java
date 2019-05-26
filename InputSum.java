import java.util.Scanner;
public class InputSum{
	public static void main(String []args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int s = a+b;
		System.out.println("Sum of "+a +" and "+ b +" is: "+ s);
	}
}