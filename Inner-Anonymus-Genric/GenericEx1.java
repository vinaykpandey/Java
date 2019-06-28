public class GenericEx{
	
	public void printA(String []s){
		for(int i=0; i<s.length; i++){
			System.out.println("String " + i + ": " +  s[i]);
		}
	}

	public void printA(Integer []s){
		for(int i=0; i<s.length; i++){
			System.out.println("Integer " + i + ": " +  s[i]);
		}
	}

	public void printA(int []s){
		for(int i=0; i<s.length; i++){
			System.out.println("int " + i + ": " +  s[i]);
		}
	}

	public static void main(String []args){
		GenericEx ge = new GenericEx();
		String cname[] = new String[]{"India", "USA", "UK"};
		Integer n[] = new Integ
		er[]{11,12,13};
		int []nr = new int[]{2,3,6,7,8}; 
		ge.printA(cname);
		ge.printA(n);
		ge.printA(nr);
	}
}