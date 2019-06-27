import java.io.*;

class ReadFile{
	public static void main(String []args) throws IOException{
		int i=0;
		FileInputStream fin;
		fin = new FileInputStream("sample.txt");
		// while(i != -1){
		// 	i = fin.read();
		// 	System.out.println((char)i);
		// }

		do{
			i = fin.read();
			if(i != -1){
				System.out.println((char)i);
			}
		}while(i != -1);
		fin.close();
	}
}