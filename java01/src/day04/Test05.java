package day04;

/*
 	while 명령
 	
 		for 명령문처럼 반복실행 할 수 있는 명령문
 		for 명령문처럼 차이점은 반복을 할 횧수를 지정하는 카운터 변수가
 		그리고 증감식도
 		명령내부에 없는 것이 차이점이다.
 		
 		형식]
 			(1)
 			while(조건식 -(2)) {
 				-(3)
 			}
 			-(4)
 			
 			순서 : 1 -> 2 -> 3 -> 2 -> 3 ->... 조건식이 true인 경우에만
 					-> (4)
 					
 */	
public class Test05 {
	
	/*
	 	구구단 출력
	 */
	public static void main(String[] args) {
		int dan = 2;
		int gop = 1;
		
		while(dan < 10) {
			System.out.println("----------------");
			
			gop = 1;
			while(gop < 10) {
				System.out.println(dan + "x" + gop + "=" + (dan * gop));
				gop ++;
				
			}
			dan ++;
		}
		System.out.println("----------------");
	}

}
