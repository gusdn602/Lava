package day03;
import java.util.*;

/*
	조건 명령문 
		: 조건을 주고 조건이 맞는경우와 맞지 않는 경우를 구분해서 처리해주는 명령문
		
		종류]
			1. if
				==>조건을 제시하고 그 조건에 맞는 경우에만 처리하는 조건문
				
				형식] 
					if(조건식) {
						실행문...
					}
					
						==> 조건식이 맞는 경우에만 실행문을 실행하고
							맞지 않는 경우에만 조건문을 건너뛰는 방식
			2. if ~ else
				==> 조건을 제시하고 조건에 맞는 경우와 맞지 않는 경우 두가지를 처리하는 함수
				
				형식 ] 
					if(조건식) {
						실행문1
					} else {
						실행문2
					}
					==> 조건식이 맞으면 실행문 1실행 안맞으면 실행문 2실행
					
			3. if ~ else if ~ else
				==> 조건을 두개 이상을 제시하고 각 조건에 맞는 경우를 처리하는 조건문
				
				형식 ] 
					if(조건식1){
					} else if(조건식2) {
						실행문1
					} else if(조건식2) {
						실행문2
					} else if(조건식3) {
						실행문3
					...
					} else {
						실행문n
					}
					
					==> 조건식을 여러개를 제시해서 그 조건문에 맞는 실행문을 실행하는 조건문
					
			4. switch ~ case
				==> 조건을 처리하는데 데이터를 여러개를 제시하고
					그 데이터에 맞는 경우 처리해주는 방법
					
					형식 ] 
						switch(데이터) {
						case 데이터1:
							실행문1;
							break;
						case 데이터1:
							실행문1;
							break;
						...
						default:
							실행문n
						}
					==> 변수의 값이 일치하는 case 문의 실행문을 실행하는 조건식
*/
public class Hw01 {
		
	public Hw01() {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("### 입력받아 처리할 경우 1, 랜덤하게 만들어서 처리할 경우 2");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				iFloor(sc);
			} else {
				rFloor();
			}
			
		}
		public void iFloor(Scanner sc) {
			//메세지 출력하고
				System.out.print("세자리 정수를 입력하세요! :");
			//숫자 꺼내서 변수에 기억하고
			int no = sc.nextInt();
			
			//십의 자리 이하는 버리고
			// 123 ==> 100 <--(123 - 23)
			//			   <-- 123/100*100
			int no2 = no;
			
			System.out.print("발생한 수 :" + no);
			//첫번째 방법
			no = no/100 * 100;
			System.out.println(", 십의 자리에서 반올림한 수 : " + no);
			//두번째 방법
			no2 = no2 - (no2%100);
			System.out.println(", 십의 자리에서 반올림한 수 : " + no2);
			
		}
		
		public void rFloor() {
			//랜덤하게 숫자 만들고
			int no = (int)(Math.random()*(999- 100 + 1)) +100;
			//십의 자리에서 반올림하고
		}
	
	public static void main(String[] args) {
		new Hw01();
		
	}
}