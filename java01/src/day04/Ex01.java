package day04;
/*
 	4 자리 숫자로 된 년도를 입력받아서 
 	윤년인지 평년인지 판단해서 출력하세요.
 	단, switch ~ case 구문으로 처리하세요.
 */
import java.util.*; //입력받을 준비
public class Ex01 {


	public static void main(String[] args) {
		//입력받을 준비
		
		Scanner sc = new Scanner(System.in);
		
		//메세지 출력
		System.out.print("4자리 년도");
		// 입력받기
		int year = sc.nextInt();
		//코드만들기 ( 4로 나눠 떨어지는수 -1, 100으로 나눠 떨어지는수 -2, 400으로 나눠 떨어지는 수 -3)
		int code = 0;
		if(year % 400 == 0) {
			code = 3;
		} else if(year % 100 == 0) {
			code = 2;
		} else if(year % 4 == 0) {
			code = 1;
		}
		//switch ~ case 조건치리...
		String hea = "평년";
		switch (code) {
		case 3:
			hea = "운년";
		case 2:
			break;
		case 1:
			hea = "윤년";
			break;
		}
		System.out.print("입력한 년도 [ " + year + "]는[" + hea + "] 입니다.");
	}
}


