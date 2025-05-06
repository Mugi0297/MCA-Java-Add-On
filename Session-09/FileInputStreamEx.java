package session_09;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		int i;
		char c;
		
		try(FileInputStream f = new FileInputStream("C:\\Users\\Mugilan\\Desktop\\MCA-Add-on\\Session-09\\Notes.txt")) {
			
			while((i = f.read()) != -1) {
				c = (char) i;   //Down casting or implicit
				System.out.print(c); 
			}
			
		}catch(IOException ex) {
			
			ex.printStackTrace();
			System.out.println(ex);
			
		}
	}
}
