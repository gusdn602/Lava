package home;
/*
 	1, 2, 3, 4, 5
	1, 2, 3, 4, a
	1, 2, 3, 4, 5
	1, 2, 3, a, b
	1, 2, 3, 4, 5
 */
public class Homework1 {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				int no = j+1;
				if(i%2 > 0 && j == 3) {
					System.out.print('a' +" ");
				} 
				if(i == 3 && j == 4) {
					System.out.print('b');
				}
				
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

}
