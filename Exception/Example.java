class Example{
	public static void main(String []args){
		try{
			System.out.println("111111");
			System.out.println(3/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero  (runtime)
			System.out.println("222222222");
		 }
		 catch(ArithmeticException e){
		 	System.out.println("Exception: "+e.getMessage());
		 }
		 catch(NullPointerException e){
		 	System.out.println("Exception: "+e.getMessage());
		 }

		 System.out.println("End Line");
	}
}