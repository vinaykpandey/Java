import java.io.*;

class BufferedWriterEx{
	public static void main(String []args) throws IOException{
		// BufferedWriter bf = new BufferedWriter(new FileWriter("buffw.txt", true));
		FileWriter fw = new FileWriter("buffw.txt", true);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("Test write 1233 ");
		bf.close();
	}
}