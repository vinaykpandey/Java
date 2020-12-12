class Example1{
	public static void main(String []args){
		System.out.println("111111");
		String s1 = null;
		// System.out.println(3/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero  (runtime)
		System.out.println(s1.length()); // Exception in thread "main" java.lang.NullPointerException
		System.out.println("222222222");
	}
}