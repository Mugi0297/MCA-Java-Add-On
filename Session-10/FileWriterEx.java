package session_10;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		
		try(FileWriter f =new FileWriter("C:\\Users\\Mugilan\\Desktop\\MCA-Add-on\\Session-10\\Sample1.txt")){
			
			String s = "This is FileWriter Demo program Content";
			char buf[] = new char[s.length()];
			s.getChars(0, s.length(), buf, 0);
			f.write(buf);
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
