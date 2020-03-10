package day02;

import java.util.Scanner;
import java.util.*;
public class Test01 {
	/*
	 	자바 프로그램의 토큰 부분
	 	
	 		==> 컴파일러는 토큰 단위로 번역을 시도한다.
	 			따라서 개발자는 컴파일러가 번역을 하는 토큰을 구분해 주어야 한다.
	 			이때 사용하는 기호가 ";" 기호를 사용해서 구분을 한다.
	 			
	 		우리가 습관적으로 int a = 20;
	 		한 이유는 토큰을 구분해주기 위한 기호이다.
	 		
	 		결론적으로 토큰이란 하나의 명령이 종료되었음을 알려주는 기호이다.
	 		
	 		만약 개발자가 토큰구분을 하지 않으면 오류가 날 수 있다.
	 		
	 		예]
	 			int a = 10
	 			int b = 20;
	 				==> 위의 두줄을 하나의 컴파일러는 하나의 명령으로 간주해서 처리할 것이고
	 					이런 명령의 형식은 자바에서 존재하지 않으므로 에러가 발생하게 된다.
	 		
	 		예]
	 			int a =10; int a =20;
	 				==> 한줄로 입력했지만 
	 					두개의 명령을 토큰으로 구분을 해줬기 때문에 각각을 인식해서 컴파일할 수 있다.
	 		
	 		참고]
	 			; 대신 } 기호가 그 역활을 대신 할 수 있다.
	 			
	 	
	 			예]
	 				if(조건식) {
	 					
	 				} // 이 부분에서 토큰이 발생하게 된다.
------------------------------------------------------------------------------------------------------------------	 	
	 	키보드로 데이터를 입력받아서 사용하는 방법
	 		1. 클래스 구문 시작전에 
	 			import java.utill.*;
	 			로 java.utill 패키지의 모든 클래스를 사용할 준비를 해둔다.
	 			==> 이 방법은 im1port java.utill 패키지 내의 Scanner 클래스만 사용할 준비를 한 것.
	 			
	 		2. 프로그램에 들어가서
	 		
	 			Scanner sc = new Scanner(system.in);
	 			
	 			이라는 명령을  이용해서 키보드를 통해서 입력 받은 도구를 준비한다.
	 			
	 		3. 키보드를 통해서 입력받을 필요가 생겼을 때
	 			
	 			변수 = sc.nextxxx();
	 			명령을 이용해서 데이터를 입력받으면 된다.
	 			
	 			이때 xxx는 입력받을 데이터의 종류에 따라 달라진다.
	 			
	 			문자열		- sc.nextLine();
	 			정수			-sc.nextInt();
	 			실수			- sc.nextFloat();
	 			
	 		참고] 
	 			정수 형태의 문자열을 정수로 변환시키는 방법
	 			Integer.ParseInt(숫자형문자열);
	 */
	public static void main (String[] args) {
		// 숫자를 입력받아서 입력받은수에서 50을 뺀수를 출력하자.
		
		// 1. 입력받을 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력한다.
		System.out.println("정수를 입력하세요 :");
		// 3. 입력받은 데이터를 문자열변수에 담는다.
		String str = sc.nextLine();
		// 입력을 받은 후 필요없으면 닫아준다.
		sc.close();
		// 4. 문자열 데이터를 정수로 변환한다.
		int num = Integer.parseInt(str);
		// 5. 변환된 정수를 계산한다.
		int result = num -50;
		// 6. 계산 결과를 출력한다.
		System.out.println("입력한 수" + num + "에서 50을 빼면" + result + "입니다.");
		
		
	}
}
