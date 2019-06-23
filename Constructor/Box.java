public class Box{
	private int l,b,h;
	
	/*public Box(){
		This is created by Compiler, if there is no constructor

	 }
	 */
	/*constructor*/
	public Box(){
		l = 10;
		b = 8;
		h = 5;
	}	

	/*constructor overloading*/
	public Box(int L, int B, int H){
		l = L;
		b = B;
		h = H;
	}

 	public static void main(String[] args) {
 		// constructor called when object initiated
		Box b_1  = new Box();  
		System.out.println(b_1);
		Box b_2 = new Box(20, 15, 10);
	}

}