package session_10;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		try(BufferedOutputStream bos = new BufferedOutputStream(System.out)){
			
			String s = "This is BufferedOutputStream demo program content";
			byte buf[] = s.getBytes();
			
			bos.write(buf);
			bos.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
