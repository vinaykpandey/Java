import java.io.*;
// import java.io.File;

class FileIntro{
	public static void main(String []args)throws IOException{
		File f = new File("/home/vinay/WorkSpace/Java/File-Handling/2.txt");
		f.createNewFile();
		System.out.println("type of class: " + f.getClass());
		System.out.println("Can file writable: " + f.canWrite());
		System.out.println("Is file exist: " + f.exists());
		System.out.println("file name: " + f.getName());
		System.out.println("length of file: " + f.length());
	}
}