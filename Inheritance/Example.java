public class Example{
	public static void main(String []args){
		Student s_1 = new Student();
		s_1.setRollno(100);
		s_1.setName("Vinay");
		s_1.setAge(33);
		System.out.println("Rollno: "+ s_1.getRollno());
		System.out.println("Name: "+ s_1.getName());
		System.out.println("Age: "+s_1.getAge());
	}
}