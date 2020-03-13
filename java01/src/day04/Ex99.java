package day04;


public class Ex99 {

	public static void main(String[] args) {
		/*
		반복문을 사용해서 다음 모양을 출력하세요.
		
		1-0.
			
			*****
			*****
			*****
			*****
			*****
		
		for(int k = 0; k<5; k++) {
		for(int i = 0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}	
	
	*/	
	/*
			1. 
				*
				**
				***
				****
				*****
				
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/		
		
	/*
			2.
				    *
				   **
				  ***
				 ****
				*****
				
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j<4-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
		
	*/	
	
	/*
			3. 
				*****
				****
				***
				**
				*
			
			for(int i =5; i>=1; i--) {
				for(int j =1; j<=i; j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	*/	
			
	/*
			4. 
				*****
				 ****
				  ***
				   **
				    *
			for(int i = 1; i<6; i++) {
			for(int j = 0; j<6; j++) {
				if(i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}		    
				    
				  
	*/
	
	/*
			5. 
				    *    
				   ***
				  *****
				 *******
				*********
				
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (4 - i) + (2 * i +1); j++) {
				String str = " ";
				if(j > 3-i){
					str = "*";
				}
				System.out.print(str);
			}
			System.out.println();
		}
	*/	
	
	/*
			6.
				    *
				   ***
				  *****
				 *******
				*********
				 *******
				  *****
				   ***
				    *
	*/	

	/*
			7-0.
				    12345
				    12345
				    12345
				    12345

	*/
		for(int i = 1; i<=5; i++) {
			System.out.print(i);
			if(i==5) {
				System.out.println();
			}
			System.out.println();
		}
	/*
			7-1.
					1  2  3  4  5
					6  7  8  9  10
					11 12 13 14 15
					16 17 18 19 20
					21 22 23 24 25
	*/

	/*
			7.
				1
				12
				123
				1234
				12345
	*/

	/*
			8.
				    1
				   12
				  123
				 1234
				12345
	*/

	/*
			9.
				12345
				1234
				123
				12
				1
	*/	

	/*
			10.
				1
				2  3
				4  5  6
				7  8  9  10
				11 12 13 14 15
	*/	

	/*
			00. 
				1	1	1	1	1
				2	2	2	2	2
				3	3	3	3	3
				4	4	4	4	4
				5	5	5	5	5
					
	 */

	}

}