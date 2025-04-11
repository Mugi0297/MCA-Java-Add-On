public class Main {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Argument length: "+args.length);
			
			if(args.length == 3) {
				
				String name = args[0];
				int age = Integer.parseInt(args[1]);
				double percentage = Double.parseDouble(args[2]);
				
				System.out.println("Name: "+name+","+"Age: "+age+","+percentage);
				
			}else {
				
				System.out.println("Index out of bound");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
