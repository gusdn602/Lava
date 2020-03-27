package hw_package.day01;

public class Work01 {
	
	public Work01() {
		
		char[][] ch = new char[5][5];
		for(int i = 0 ; i < 5; i++ ) {
			for(int j = 0 ; j < ch[i].length ; j++ ) {
				ch[i][j] = (char)('Y' - j  - 5 * i);
			}
		}
		
		for(char[] c : ch) {
			for(char c1: c) {
				System.out.print(c1 + ", ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Work01();
	}

}
