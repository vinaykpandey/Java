import java.io.*;

class FileWrite{
	public static void main(String []args) throws IOException{
		int i;
		FileOutputStream fout;
		fout = new FileOutputStream("sample.txt", true);

		String s = "VINAY PANDEY";
		char ch[] = s.toCharArray();
		for(i=0; i<s.length(); i++){
			fout.write(ch[i]);
		}
		fout.close();
	}
}