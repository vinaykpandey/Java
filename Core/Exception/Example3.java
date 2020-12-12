class Example{
	public static void main(String []args){
		int b = 500;
		int wa = 600;
		if(b < wa){
			throw new ArithmeticException("Insufficient balance");
		}
		b = b-wa;
		System.out.println("End Line");
	}
}