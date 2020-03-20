package day10;
/*
 문제 1]
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고
	출력하세요. 
 */

public class Ex01 {

		double ban; //반지름
		double dool; // 둘레
		double area; // 넓이
		
	public void setBan() {
		ban = (int)(Math.random()*201 - 100); // 100 - (-100) + 1) + (-100)
	}
	
	public void setDool() {
		dool = 2*3.14*ban;
	}
	
	public void setArea() {
		area = 3.14*ban*ban;
	}
	public void Print() {
		System.out.printf("반지름 : %10.2f, \n둘   레 : %10.2f, \n넓   이 : %10.2f\n", ban, dool,area);
	}
}
