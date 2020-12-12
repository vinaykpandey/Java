import java.io.*;

class BufferedReaderEx{
	public static void main(String []args) throws IOException{
		// int ch;
		// BufferedReader bf = new BufferedReader(new FileReader("buffw.txt"));
		// while((ch = bf.read()) != -1){
		// 	System.out.println((char)ch);
		// }
		// bf.close();

		// BufferedReader bf = new BufferedReader(new FileReader("1.txt"));
		// String s1;

		// s1 = bf.readLine(); // print first line
		// while((s1 = bf.readLine()) != null ){
		// 	System.out.println(s1);
		// }
		
		// bf.close();

		BufferedReader bf = new BufferedReader(new FileReader("1.txt"));
		char []s = new char[20];
		bf.read(s, 0, 20);
		System.out.println(s);
		bf.close();
	}
}