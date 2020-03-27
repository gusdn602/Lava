package day14;

public class Dongle {
	private int red;
	private double arround, area;
	public Dongle(int red) {
		this.red = red;
		setArround();
		serArea();
	}
	//둘레 구해주는 함수
	public void setArround() {
		arround = 2 * 3.14 * red;
	}
	
	//면적구해주는 함수
	public void serArea() {
		area = 3.14 * red * red;
	}
	//area는 접근지정자가 private 이고 이것은 클래스내에서만 접근이 가능하므로 함수를 만들어서 데이터를 반환해주도록 하자.
	//함수를 만들어서 데이터를 반환해주도록 하자
	public double getArea() {
		return area;
	}
	//이제 면적이 같으면 같은 원으로 판단되도록 equals 함수를 오버라이드 해보자
	public boolean equals(Object obj) {
		//반환값 담을 변수 선언 및 초기화
		boolean bool = false;
		
		//입력되는 Dongle 인스턴스는 오브젝트 타입으로 자동 형변환이 되서 기억이 될 것이므로 
		//Dongle 타입으로 강제 형변환을 시켜서 멤버를 사용해야 한다.
		Dongle d1 = (Dongle) obj;
		
		//타입은 변환이 됬고 이제 면적을 꺼내서 비교해보자
		//비교는 대상이 두개가 필요하다. 하나는 매개 변수로 입력을 받았다. 그럼 다른 하나는???
		bool = (this.area == d1.area) ? true : false;
		
		//결과 반환해주고...
		return bool;
	}
}
