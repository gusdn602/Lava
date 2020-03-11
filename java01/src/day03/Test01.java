package day03;
import java.util.*;
public class Test01 {
/*
  	제어 명령
  		==> 컴퓨터는 원칙적으로 코드를 실행할 때 순서대로 실행함을 원칙으로 한다.
  			(위에서 아래로, 왼쪽에서 오른쪽으로 읽어서 실행을 한다.)
  			그런데 프로그램을 제작하다 보면 이 순서가 바뀌어야 되는 경우가 발생을한다.
  			이 경우 사용하는 명령이 제어 명령이다.
  			
  			종류 ] 
  				1. 조건제어명령
  					==> 특정 조건에 따라서 실행순서를 변경하는 명령
  					
  					형식 1] ==> 조건식이 참일 경우만 처리하는 조건 명령
  						==> 거짓일 경우의 처리내용은 없다. 그냥 건너뛴다.
  						(1)
  						if(조건식 -(2)) {
  							처리내용 - (3)
  						}
  						-(4)
  						
  						조건식이 참일 경우 : (1) -> (2) -> (3) -> (4)
  						조건이 거짓일 경우 : (1) -> (2) -> (4)
  						
  					형식 2]
  						==> 조건식이 참일 경우와 거짓일 경우의 처리내용을 모두 기술해 놓는 조건문
  						(1)
  						if(조건식 -(2)){
  							실행문1 -(3)  <== 참일경우 실행부
  						} else {
  							실행문2 -(4) <== 거짓일 때 실행부
  						}
  						-(5)
  						
  						조건식이 참일 경우 : (1) -> (2) -> (3) -> (5)
  						조건식이 거짓일 경우 :(1) -> (2) -> (4) -> (5)
  						
  						 형식 3]
  						 	==>두가지 이상의 조건식을 주고 각 조건이 맞는 경우 처리내용을 정의 해놓는 조건문
  						 	(1)
  						 	if(조건식1 -(2)) {
  						 	실행문1 -(3)
  						 	}	else if(조건식2 - (4)){
  						 	실행문2 -(5)
  						 	}else if(조건식n - (n)){
  						 		실행문 n - (6)
  						 	}	else {
  						 		실행문 m - (8)
  						 	}
  						 	
  						 	- (9)
  						 	
  						 	조건식이 1이 참일 경우 : 1 -> 2 -> 3 -> 9
  						 	조건식  2이 참일 경우 : 1 -> 2 -> 4 -> 5 -> 9
  						 	조건식 n이 참일경우 : 1 -> 2 -> ..... -> n -> 6 -> 9
  						 	모든 조건이 거짓일 경우 : 1 -> 2 -> ... -> n -> 8 -> 9
  						 	
  						참고 ] 
  							제어 명령은 중첩해서 사용가능하다.
  							
  							예]
  								if(조건식1){
  									if(조건식2) {
  								} else {
  								
  								}
  								
  							} else {
  								if(조건식3) {
  								
  								} else {
  								
  								}
  							}
  							
  					형식 4 ]
  						switch ~ case
  							==> 다중 조건식 이라고도 말하며 
  								여러개의 질문을 차례로 처리할 수 있는 명령이다.
  								
  								*****
  								주의]
  									switch ~ case ,문에서는 
  									case문 맨 아래쪽에는 반드시 
  										break;
  									명령을 기술해야한다.
  									
  								형식]
  									(1)
  									switch(비교내용 -(2)){
  									case 데이터1: - (3)
  										실행문1	- (4)
  										break;  - (5)
  									case 데이터2;	- (6)
  										실행문2;	- (7)
  										break; 	- (8)
  									....
  									default :
  										실행문n;	- (9)
  									}
  									
  									- (10)
  									
  									순서]
  										비교내용과 데이터1이 같을 경우 	: 1 -> 2 -> 3 -> 4 -> 5 -> 10
  										비교내용과 데이터2이 같을 경우 	: 1 -> 2 -> 3 -> 6 -> 7 -> 8 -> 10
  										비교내용과 일치하는 데이터가 없는 경우 	:
  										 	1 -> 2 -> 3 -> 6 -> ... -> 9 -> 10
  				2. 반복제어명령
 */
	
	// 예제 ] 숫자 두개를 입력받아서 큰수에서 작은수를 뺀 차를 출력하세요.
	public Test01() {
		solv();
	}
	public void solv() {
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력하고 *3
		//숫자 입력받아 변수에 담고 *3
		//첫번째 숫자.
		System.out.print("첫 번째 숫자: ");
		int no1 = sc.nextInt();
		
		//두번째 숫자
		System.out.print("두 번째 숫자: ");
		int no2 = sc.nextInt();
				
		//크기 비교하고
		//블럭 안에 만들어진 변수는 블럭 밖으로 빠져나오면 사라지는 변수이므로 
		//차를 저장할 변수는 조건문 밖에 만들어두자.
		
		int cha = 0; //변수선언 & 변수 초키화
		int max = 0;
		int min = 0;
		if(no1 > no2) {
			max = no1;
			min = no2;
			cha = no1 - no2;
		} else {
			max = no2;
			min = no1;
			cha = no2 - no1;
		}
		if(no1 > no2) {
			cha = no1 - no2;
		} else {
			cha = no2 - no1;
		}
		/*
		 		심화문제]
		 				큰수와 작은수를 구분하는 변수를 두개만들지 말고
						추가적으로 하나만 만들어서 큰수와 작은수를 구분하세요.
		 */
		
		if(no2 > no1) {
		int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		System.out.println("입력한 두수 " + no1 + "&" + no2 + "의 차는 " + cha + "입니다.");
		//출력하고
	}
	public static void main(String[] args) {
		new Test01();
	}

}
