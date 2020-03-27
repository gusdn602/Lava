package day09;
/*
 	숫자 두개를 입력하면
 	두 숫자를 산술연산해주는 함수들을 만들고
 	실행을 해서 
 	변수에 기억하고 
 	변수를 출력하는 프로그램을 작성하세요.
 */
public class Test02 {
	public Test02() {
		int gap = plus(3,7);
		int gap2 = minus(5,6);
		int gap3 = gop(100,100);
		int gap4 = manu(150,100);
		
		System.out.println(gap);
		System.out.println(gap2);
		System.out.println(gap3);
		System.out.println(gap4);
	}
	public int plus(int no1, int no2) {
	int sum = no1 + no2;
	return sum;
	}
	
	public int minus(int no1, int no2) {
		int minus = no1 - no2;
		return minus;
	}
	
	public int gop(int no1, int no2) {
		int gop = no1 * no2;
		return gop;
	}
	
	public int manu(int no1, int no2) {
		int nanugi = no1/no2;
		return nanugi;
	}
	
	
	
	public static void main(String[] args) {
		new Test02();
}

	}



