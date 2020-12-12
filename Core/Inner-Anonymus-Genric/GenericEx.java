public class GenericEx{
	
	// public void printA(String []s){
	// 	for(int i=0; i<s.length; i++){
	// 		System.out.println("String " + i + ": " +  s[i]);
	// 	}
	// }

	// public void printA(Integer []s){
	// 	for(int i=0; i<s.length; i++){
	// 		System.out.println("Integer " + i + ": " +  s[i]);
	// 	}
	// }

	// public void printA(int []s){
	// 	for(int i=0; i<s.length; i++){
	// 		System.out.println("int " + i + ": " +  s[i]);
	// 	}
	// }

	/*
	Generic method to process same type of data but types  is different
	Its decide data time at early bind (compile time)
	*/ 

	public <E> void printA(E []s){
		// for(int i=0; i<s.length; i++){
		// 	System.out.println("String " + i + ": " +  s[i]);
		// }
		for(E x:s){
			System.out.println(x);
		}
	}

	public static void main(String []args){
		GenericEx ge = new GenericEx();
		String cname[] = new String[]{"India", "USA", "UK"};
		Integer n[] = new Integer[]{11,12,13};
		ge.printA(cname);
		ge.printA(n);
	}
}