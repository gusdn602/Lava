package day11;

public class Dongle extends Dohyung{
	int rad;
	double arround;
	
	public Dongle() {
		this(1);
	}
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	//원의 둘레 게산해 주는 함수.
	public void setArround() {
		arround = 2 * rad* 3.14;
	}
	//원의 넓이 게산해 주는 함수.
	public void setArea() {
		area = rad * rad * 3.14;
	}
	// 출력함수  - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("원의 반지름 : %3d\n원의 둘레 : %5.2f\n원의 넓이 : %5.2f\n", rad, arround, area);
	}
}
