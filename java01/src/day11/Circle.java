package day11;
/*
 	문제 1]
 		이 클래스는 원의 정보를 저장할 클래스이다.
 		이 클래스 객체가 될때 반지름을 입력받아서 원의 대한 정보가 입력이 되게
 		클래스를 정의 하세요.
 		
 		반지름이 입력이 안될 경우는 10으로 입력되게 하세요.
 */
public class Circle {
	//이 클래스는 원의 대한 정보를 기억하는 클래스이므로
	//반지름, 둘레, 넓이를 기억하면 될것이다.
	int ban;
	double bandool, nall;
	
	//기본 생성자 함수
	public Circle() {
		this(10);
	}
	//생성자 함수 오버로딩
	public Circle (int ban) {
		this.ban = ban;
		getArrround(ban);
		getArea(ban);
	}
	
	//원의 둘레 구해주는 함수 
	public double getArrround(int ban) {
		return bandool = 2* ban* 3.14;
	}
	
	public double getArea(int ban) {
		return nall = ban*ban*3.14;
	}
	public void toPrint() {
		System.out.printf("반지름 : %5d | 원의 둘레 : %7.2f | 원의 넓이 | %7.2f \n " , ban,bandool, nall);
	}
}
