package day03;

public class Ex01 {
/*
 	1 ~ 100까지의 정수 세개를 랜덤하게 만들어서 
 	세 수가 큰 수부터 차례로 출력되게 하세요.
 	단, 변수는 4개를 넘기지 마세요. 
 */
	public Ex01() {
		ex01();
	}
	public void ex01() {
		//세 정수 랜덤하게 생성
		int max = (int)(Math.random()* (100 -1 + 1)) +10;
		int mid = (int)(Math.random()* (100 -1 + 1)) +10;
		int min = (int)(Math.random()* (100 -1 + 1)) +10;
		//임시 변수를 만든다.
		int tmp = 0;
		
		//비교해서 처리한다.
		if(max >= mid) {
			// max > mid
			if(mid >= min) {
				//할일없음
			} else {
				if(max >= min) { //max > min > mid
					tmp = mid;
					mid = min;
					min = tmp;
				} else { //min > max > mid
					//제일 큰값 셋팅			
					tmp = max;
					max = min;
					min = tmp;
															
					//중간값 셋팅
					tmp = min;
					mid = min;
					min = tmp;
				}
			}
	}	else {
		tmp = max;
		max = mid;
		mid = tmp;
		
		if(mid >= min) {
			// 할일없음
		} else {
			tmp = mid;
			mid = min;
			min = tmp;
		}
	}
	//출력한다.
		System.out.println("max :" + max);
		System.out.println("mid :" + mid);
		System.out.println("min :" + min);
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
