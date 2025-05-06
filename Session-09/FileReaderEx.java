package session_09;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try(FileReader f = new FileReader("C:\\Users\\Mugilan\\Desktop\\MCA-Add-on\\Session-09\\Notes.txt")){
			
			char[] a = new char[100];
			f.read(a);
			for(char c : a) {
				System.out.print(c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
