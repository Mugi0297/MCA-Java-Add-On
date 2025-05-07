package session_10;

public class AsyncNumberPrinting {

	public static void main(String[] args) {
		Thread t1 = new NumberPrinter(1, 10);
		Thread t2 = new NumberPrinter(90, 100);
		
		t1.start();
		t2.start();
	}
}
