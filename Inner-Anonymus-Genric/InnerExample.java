class Outer{
	static int x = 10;
	void f1(){

	}
	protected class Inner{
		void infn(){
			System.out.println(" inside ---- sif1 non static method " + x);
		}
	}

	static class InnerStatic{
		// can not access outer class properties/method
		void sinfn(){
			//non-static variable x cannot be referenced from a static context
			// System.out.println(" inside ---- static sif1 method " + x);
			System.out.println(" inside ---- static sif1 method " + x);
		}
	}
}


public class InnerExample{
	public static void main(String []args){
		Outer o = new Outer(); // only access Outer class
		Outer.InnerStatic oins = new Outer.InnerStatic();
		oins.sinfn();
		
		// if inner class is non-static
		//Outer.Inner oins = new Outer.Inner(); // wrong instance that contains Outer.Inner is required
		Outer ot = new Outer();
		Outer.Inner i = ot.new Inner();
		i.infn();	
	}
}