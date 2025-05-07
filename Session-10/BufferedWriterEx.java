package session_10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		try(BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			String bike[] = {"Yamaha FZ4", "Honda sp125", "RE", "Harley Davidson"};
			b.write("Different types of bike category are:"+ "\n");
			
			for(int i = 0; i<4; i++) {
				b.write(bike[i]+ "\n");
				b.flush();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
