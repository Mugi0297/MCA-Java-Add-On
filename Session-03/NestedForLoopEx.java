package session_03;

import java.util.Scanner;

public class NestedForLoopEx {

	public static void main(String[] args) {
		
		/**
		 * 			col
		 *           
		 * row==>0==>25(0,0) 5(0,1) 36(0,2)
		 *       1==>12(1,0) 4(1,1) 75(1,2)
		 *       2==>47(2,0) 6(2,1) 23(2,2)
		 */
		
		//pattern 1 ==>Square pattern
		/*for(int i = 1; i<=5; i++) { //1 to 5 ==>row
			for(int j = 1; j<=5; j++) { //1 to 5 ==>col
//				System.out.print(i+" ");
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		//pattern 2 ==>Right angled triangle
		/*for(int i = 1; i<=5; i++) { //i =1,2,3
			for(int j = 1; j<i+1; j++) { //j=1 ; j<4 5+1=6 j<6
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		//pattern 3 ==>Inverted Right angled triangle
		/*int num = 6;
		for(int i = 0; i<=num; i++) {
			for(int j = 1; j<=num-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//pattern 4 ==>Diamond pattern
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows: "); //5
		
		int rows = sc.nextInt(); //rows = 5
		
		//Top half of the diamond
		for(int i = 1; i<=rows; i++) { //i<=5  i=1, 2
			
			//print leading spaces
			for(int j = i; j<rows; j++) { //j=1,2 ; j<5  4-->spaces
				System.out.print(" ");
			}
			
			//Print stars
			for(int k =1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/**
		 * BODMAS-->rule
		 * k = 1 k<=2*1-1==>2-1=1
		 * k = 2 k<=2*2-1==>4-1=3
		 * k = 3 k<=2*3-1==>6-1=5
		 * k = 4 k<=2*4-1==>8-1=7
		 * k = 5 k<=2*5-1==>10-1=9
		 */
		
		//Bottom half of the diamond
				for(int i = rows-1; i>=1; i--) {
					
					//print leading spaces
					for(int j = rows; j>i; j--) {
						System.out.print(" ");
					}
					
					//Print stars
					for(int k =1; k<=(2*i-1); k++) {
						System.out.print("*");
					}
					
					System.out.println();
				}
				
	}
}
