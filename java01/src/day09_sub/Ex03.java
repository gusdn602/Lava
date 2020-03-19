package day09_sub;

/*
	1 2 3 4 5
	2 3 4 5 6
	3 4 5 6 7
 */
public class Ex03 {

	public static void main(String[] args) {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<5; j++) {
				int no = i + j + 1;
				
				if(no % 3 == 0) {
					no = 99;
				}
				System.out.print(no + " ");
			}
			System.out.println();
		}

	}

}
