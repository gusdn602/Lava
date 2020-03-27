package day04;
/*
 	4자리 숫자로 된 년도를 입력받아서
 	그 해가 윤년인지 아닌지 판단하세요.
 */
//라이브러리 생성
import java.util.*;
public class Test01 {

	public Test01() {
		
	}

	public static void main(String[] args) {
		//작업순서
		// 0. 필요한 변수 선언
		Scanner sc;
		int year;
		String hea = "평년";
		// 1. 입력받을 준비
		sc = new Scanner(System.in);
		// 2. 메세지 출력
		System.out.print("몇년도 ??? : ");
		// 3. 년도 꺼내서 변수에 담기
		year = sc.nextInt();
		// 4. 조건처리해서 판단
		if(year % 400 == 0) {
			/*
			 	400으로 나눠 떨어지는 수가 발생했을 경우 실행되는 부분
			 	이 경우는 이 블럭을 실행시키고 
			 	전체 조건문 자체를 종료한다.
			 */
			hea = "윤년";
			System.out.print("4로 나눠 떨어지는 수");
		} else if(year % 100 == 0) {
			/*
			 	이 블럭을 실행하는 경우 400으로 나눠 떨어지지 않는 경우 
			 	100으로 나눠 떨어지는 수가 실행되는 부분.
			 */
			hea = "평년";
			System.out.print("100로 나눠 떨어지는 수");
		} else if(year % 4 == 0) {
			// year % 400 != 0 && year % 100 != 0
			hea = "윤년";
			System.out.print("400으로 나눠 떨어지는 수");
		} /*else {
			hea = "평년";
		}*/
		// 5. 결과 출력하기
			System.out.print("입력한 해 [" + year + "]는 ["+ hea + "]입니다.");
	}
}


