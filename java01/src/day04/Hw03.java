package day04;
/*
 	(중복된 반복 루프문으로 처리)
 	3 ~100사이의 수중 소수만 출력해주는 프로그램 작성.
 	
 	소수 : 1과 자기자신으로만 나눌 수 있는 수
 	
 	comm]
 		위 문제의 결과로 찾아낸 소수의 갯수를 맨 마지막에 출력하세요.
 */
public class Hw03 {

	public static void main(String[] args) {
		// 2부터 100까지 수를 반복해서 소수 검사한다.
		int count = 0;
		loop:
		for(int i = 2; i<100; i++) {
			
			//나눌수 있는 수가 있는지 검사
			
			for(int j = 2; j < i; j++) {
				if(i %j ==0 ) {
					
					continue loop;	
				}
			}
			//위의 반복문이 정상적으로 끝까지 반복 처리가 됬다면 이 행을 실행할 것이고
			//그 말은 나눌 수 있는 수(j)가 없다는 말이므로 이 수(i)는 소수일 것이다.
			
			// 그러면 소수를 출력하면 댐
			System.out.print(i + " , ");
			++count;
		}
		
		System.out.println("총 갯수 :" + count);
	}

}
