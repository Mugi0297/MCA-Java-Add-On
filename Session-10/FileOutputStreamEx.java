package session_10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException{
		
		String s = "Demo content for FileOutputStream Example";
		byte buf[] = s.getBytes();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Mugilan\\Desktop\\MCA-Add-on\\Session-10\\Sample.txt")){
			
			for(int i = 0; i<buf.length; i++) {
				fos.write(buf[i]);
				System.out.println(i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
