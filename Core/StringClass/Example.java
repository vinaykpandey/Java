public class Example{

	public static void main(String []args){
		// String s1 = "abc";
		// String s2 = "abc";
		// String s3 = new String("abc");
		// System.out.println("Result 1: "+ (s1 == s2)); // true
		// System.out.println("Result 2: "+ s1.equals(s2)); // true
		// System.out.println("Result 3: "+ (s1 == s3)); // false
		// System.out.println("Result 2: "+ s1.equals(s3)); // true
		String s1 = "Abc";
		System.out.println("Result 1:" + s1);
		s1 = s1.toUpperCase();
		System.out.println("Result 2: " + s1);
		s1 = s1.toLowerCase();
		System.out.println("Result 3: " + s1);

	}
}