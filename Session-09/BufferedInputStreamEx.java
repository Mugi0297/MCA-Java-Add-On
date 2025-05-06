package session_09;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		String s = "This content is about BufferedInputStream Demo program";
		byte buf[] = s.getBytes();
		/**
		 * 
		 * --->String convert to byte array.
		 * --->Then passed to object of ByteArrayInputStream Class.
		 * --->The ByteArray data has been passed to BufferedInputStreamStream.
		 * --->Finally in the while loop for each line the char by char the data
		 *     been printed.
		 * 
		 */
		try(ByteArrayInputStream bt = new ByteArrayInputStream(buf);
				BufferedInputStream f = new BufferedInputStream(bt)){
			
			int c;
			while((c = f.read()) != -1) {
				System.out.print((char)c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
