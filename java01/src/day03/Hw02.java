package day03;

/*
	문제 2]
 0 ~255 사이의 숫자를 랜덤하게 만들고  -1
 그 숫자를 코드값으로 하는 문자를 만들어서 -2
 해당 문자가 영문자인지 아닌지 판별해서 출력하세요 -3
 단, 삼항 연산자를 사용해서 처리. -4
*/


public class Hw02 {
	public Hw02() {
		solv1();
	}
	//숫자를 랜덤하게 만들고 문자로 변경하고 영문자인지 아닌지 판별하는 함수
	
	public void solv1() { 
		// 1. 0 ~ 255 랜덤한 숫자를 만들고
		int num = (int)(Math.random() * 256);
		// 2. 문자로 변경하고
		char ch = (char)num;
		// 3. 문자를 판별해서 출력하고
		String msg = (ch >= 'A' && ch <= 'Z') ? ("영대문자") :
												(
														(ch >= 'a' && ch <= 'z') ? ("영소문자") :("영문자아닌문자")
												);
		// 4. 출력하고
		System.out.println("랜덤하게 발생한 문자 :"+ " ["+ch + " ]는" + msg + "입니다.");
	}
	public static void main(String[] args) {
		new Hw02();
	}

}
