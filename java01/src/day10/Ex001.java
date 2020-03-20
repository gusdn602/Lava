package day10;
/*
문제 1]
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고
	출력하세요. 
*/

public class Ex001 {
	
	public static void main(String[] args) {
		Ex01[] ex01 = new Ex01[10];
		
		for(int i = 0 ; i < ex01.length ; i++ ) {
			ex01[i] = new Ex01();
			ex01[i].setBan();
			ex01[i].setDool();
			ex01[i].setArea();
		}
		
		// 출력하기
		for(int i = 0 ; i < ex01.length ; i++ ) {
			ex01[i].Print();
		}
		
		
	}
}
