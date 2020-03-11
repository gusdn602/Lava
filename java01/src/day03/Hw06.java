
/*
	 문제 6]
	 임의의 년도를 입력받아서
	 해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
	 
	 단, 삼항 연산자를 사용할 것.
	 
	 윤년의 정의 ]
	 		4로 나눠 떨어지고 100으로 나눠떨어지지 않으며 
	 		400으로 나눠 떨어지는 해를 윤년이라고 한다.
*/
package day03;
import java.util.*;
public class Hw06 {
	public Hw06() {
		solv();
	}
	public void solv() {
		//1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//2. 메세지 출력
		System.out.print("년도를 입력하세요! :");
		//3. 입력한 숫자에 변수담기
		int year = sc.nextInt();
		//4. 윤년인지 평면인지 판별
		String result = (year % 4 !=0) ? ("평년") : (year % 100 != 0) ? ("윤년") : (
						(year % 400==0) ? "윤년" : "평년"
				);
		//5. 출력
		System.out.println("입력한 해 [" + year + "]는 [" + result + "] 입니다.2020");
	}


	public static void main(String[] args) {
		new Hw06();
	}

}
