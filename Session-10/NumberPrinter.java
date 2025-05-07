package session_10;

public class NumberPrinter extends Thread{

	private final int start;
	private final int end;
	
	public NumberPrinter(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i = start; i<=end; i++) {
			System.out.println(i);
			
			try {
				
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
