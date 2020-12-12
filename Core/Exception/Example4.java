class Example{
	public static void main(String []args){
		int b = 500;
		int wa = 600;
		try{
			if(b < wa){
				throw new ArithmeticException("Insufficient balance");
			}
			b = b-wa;
			System.out.println("Remaining balance "+ b);
		}
		catch(ArithmeticException e){
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("End Line");
	}
}