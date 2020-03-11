/*
문제 4]
소수점이 있는 숫자를 입력한 후
소수점 이하 세째자리에서 반올림한 결과를 출력하세요.

원리]
	+0.005 을 하면 세째자리에서 변화가 일어날 것이도
	여기에 *100 해주면 두째까지 정수부에 들어갈 것이고
	이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고
	다시 / 100 해주면 원 소수점 형태로 변환될 것이고...
	 
*/

package day03;
//라이브러리 가져오고
import java.util.*;

public class Hw04 {
	public Hw04() {
	//입력받을 준비하고
	Scanner sc = new Scanner(System.in);
	//메세지 출력하고
	System.out.print("실수를 입력하세요! :");
	//실수 입력받아 변수에 담고
	double num = sc.nextDouble();
	//함수 변수데이터 넘겨주면서 실행하고 데이터 받고
	double result = banolim(num);
	//데이터 출력하고
	System.out.println("입력받은 실수 :" + num + "\n반올림한 실수 :" + result);
	
		
	}
	
	// 실수를 소수 둘째 자리에서 반올림 해주는 함수
	
	public double banolim (double no) {
		//반환 값을 담을 변수를 만들고
		double result = 0;
		
		//입력받은 데이터 반올림하고(소수세째자리에서...)
		/*
		 	double no = 123.4567
		 	int no1 = (int)(no * 1000) ; ===> 123456
		 	no1 = no1 +5;				===> 123461
		 	no1 = (no1/10) /100.				===> 123.46
		 */
		int no1 = (int) (no * 1000);
		no1 +=5;
		result = (no1 / 10) / 100;
		// 데이터 반환하고                       
		return result;
	}
	
	public static void main(String[] args) {
		new Hw04();

	}

}
