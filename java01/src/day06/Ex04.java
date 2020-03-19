package day06;

/*
 	문제 4]
	
	반지름 5개를 기억할 배열을만들고 							- 정수배열1개 
	랜덤하게 2 ~ 30개까지의 5개 반지름을 만들어서 입력하고			- Math.random()
	각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고		- 실수배열 1개 
	각 원의 둘레를 계산해서 저장할 배열도 만들어서				- 실수배열 1개
	
	결과를 출력하는 프로그램을 작성하세요. 					- 반복문으로 꺼내서 출력
	
	단, 출력형태는
		
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
		
		의형태로 출력하세요.
 */
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		int ban[] = new int[5];	
		double won[] = new double[5];
		double wond[] = new double[5];
		 
		for(int i = 0; i<5; i++) {
			int b = (int)(Math.random() * (30 - 2 +1)) +2;
			ban[i] = b ;
			won[i] = 2.*3.14*ban[i];
			wond[i] = 3.14*ban[i]*ban[i];
		}
		System.out.println("반지름 :" + Arrays.toString(ban));
		System.out.println("원의 둘레 :" + Arrays.toString(won));
		System.out.println("원의 넓이 :" + Arrays.toString(wond));
	}

}
